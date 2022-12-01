package com.musala.drone.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
public class CloudinaryConfig {

    private Cloudinary cloudinary;
    @Autowired
    public CloudinaryConfig(@Value("${cloud.key}") String key,
                            @Value("${cloud.secret}") String secret,
                            @Value("${cloud.name}") String cloud) {
        cloudinary = Singleton.getCloudinary();
        cloudinary.config.cloudName=cloud;
        cloudinary.config.apiSecret=secret;
        cloudinary.config.apiKey=key;
    }

    public Map<String, String> upload(Object file, Map<String, Object> options) {
        Map<String, String> upload = Map.of("url", "");
        try {
            return cloudinary.uploader().upload(file, options);
        }
        catch (IOException e) {
            e.printStackTrace();
            return upload;
        }
    }

}

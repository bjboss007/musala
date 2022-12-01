package com.musala.drone.config;

import com.musala.drone.enums.Model;
import com.musala.drone.enums.State;
import com.musala.drone.model.Drone;
import com.musala.drone.model.Medication;
import com.musala.drone.repository.DroneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class AppInit implements InitializingBean {

    private final DroneRepository droneRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        if(droneRepository.count() <= 0) loadDrones();
    }

    private void loadDrones(){
        Drone drone = Drone.builder()
                .model(Model.Heavyweight)
                .state(State.LOADING)
                .weight(500)
                .medicationList(Arrays.asList(
                        Medication.builder()
                                .code("PMD")
                                .weight(20)
                                .name("Paracetamol")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build(),
                        Medication.builder()
                                .code("SEP")
                                .weight(200)
                                .name("Septrine")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build()
                )).build();

        Drone drone2 = Drone.builder()
                .model(Model.Middleweight)
                .state(State.LOADING)
                .weight(300.00)
                .medicationList(Arrays.asList(
                        Medication.builder()
                                .code("PMD")
                                .weight(40.00)
                                .name("Paracetamol double")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build(),
                        Medication.builder()
                                .code("SEP")
                                .weight(12.00)
                                .name("Septrine single")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build()
                )).build();

        Drone drone3 = Drone.builder()
                .model(Model.Lightweight)
                .state(State.LOADING)
                .weight(100.00)
                .medicationList(Arrays.asList(
                        Medication.builder()
                                .code("PMD")
                                .weight(20.00)
                                .name("Paracetamol")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build(),
                        Medication.builder()
                                .code("SEP")
                                .weight(20.00)
                                .name("Septrine")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build()
                )).build();

        Drone drone4 = Drone.builder()
                .model(Model.Cruiserweight)
                .state(State.LOADING)
                .weight(400.00)
                .medicationList(Arrays.asList(
                        Medication.builder()
                                .code("PMD")
                                .weight(20.00)
                                .name("Paracetamol")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build(),
                        Medication.builder()
                                .code("SEP")
                                .weight(20.00)
                                .name("Septrine")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build()
                )).build();

        Drone drone5 = Drone.builder()
                .model(Model.Lightweight)
                .state(State.IDLE)
                .weight(40)
                .build();

        Drone drone6 = Drone.builder()
                .model(Model.Lightweight)
                .state(State.LOADED)
                .weight(40)
                .medicationList(Arrays.asList(
                        Medication.builder()
                                .code("PMD")
                                .weight(20)
                                .name("Paracetamol")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build(),
                        Medication.builder()
                                .code("SEP")
                                .weight(20)
                                .name("Septrine")
                                .image("http://res.cloudinary.com/habib007/image/upload/v1645218982/qtbgc8ic4eidr7zhbeg7.jpg")
                                .build()
                )).build();

        droneRepository.saveAll(Arrays.asList(drone, drone2, drone3, drone4, drone5, drone6));
    }


}

package com.musala.drone.assemblers;

import com.musala.drone.api.DroneController;
import com.musala.drone.model.Drone;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class DroneAssembler implements RepresentationModelAssembler<Drone, EntityModel<Drone>> {

    @Override
    public EntityModel<Drone> toModel(Drone drone) {
        return EntityModel.of(
                drone,
                linkTo(methodOn(DroneController.class).fetchDroneWithDroneId(drone.getId())).withSelfRel(),
                linkTo(methodOn(DroneController.class).fetchMedicationList(drone.getId())).withRel("medications"),
                linkTo(methodOn(DroneController.class).getDroneBatteryLevel(drone.getId())).withRel("battery-level"),
                linkTo(methodOn(DroneController.class).fetchAllDrones()).withRel("all")
        );
    }

    @Override
    public CollectionModel<EntityModel<Drone>> toCollectionModel(Iterable<? extends Drone> entities) {
        return RepresentationModelAssembler.super.toCollectionModel(entities);
    }
}

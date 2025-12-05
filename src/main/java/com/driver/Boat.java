package com.driver;

public class Boat extends Vehicle implements WaterVehicle {

    private String vehicleName;
    private int vehicleCapacity;

    public Boat(String name, int capacity) {
        // Boat is a Vehicle, so call the super constructor
        super(name);
        // Initialize fields based on WaterVehicle requirements
        this.vehicleName = name;
        this.vehicleCapacity = capacity;
    }

    // Implementing methods from WaterVehicle interface
    @Override
    public String getVehicleName() {
        return vehicleName;
    }

    @Override
    public int getVehicleCapacity() {
        return vehicleCapacity;
    }
}
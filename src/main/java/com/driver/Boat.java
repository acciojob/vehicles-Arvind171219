package com.driver;

public abstract class Boat implements WaterVehicle{
    private final String name;
    private int capacity;
public Boat(String name,int capacity){
    this.name=name;
    this.capacity=capacity;
}
    @Override
    public String getVehicalName() {
        return name;
    }

    @Override
    public int getVehicalCapacity() {
        return capacity;
    }
}
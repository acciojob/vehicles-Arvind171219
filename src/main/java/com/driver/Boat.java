package com.driver;

public class Boat implements WaterVehicle{
    private final String name;
    private final int capacity;
    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;
    }

    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }

    @Override
    public String getVehicalName(){
      return name;
    }
    @Override
    public int getVehicalCapacity(){
        return capacity;
    }
}

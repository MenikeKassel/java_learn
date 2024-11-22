package com.homework14;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(Vehicles vehicles, String name) {
        this.vehicles = vehicles;
        this.name = name;
    }
    public void  passRiver(){
        if (!(vehicles instanceof Boat)) {
            Boat boat = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        if (vehicles == null){
            Horse horse = VehiclesFactory.getHorse();
        }
        vehicles.work();


    }
}

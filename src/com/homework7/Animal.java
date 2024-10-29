package com.homework7;


class Animal {
    String type = "Unknown Animal";

    public Animal() {
        System.out.println("Animal Constructor");
    }

    public Animal(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}



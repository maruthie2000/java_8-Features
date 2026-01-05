package com.nit;

public class Car implements Demo{

    @Override
    public void startVehical() {
        System.out.println("Car Started..");
    }
    public static void main(String[] args){
        Car c = new Car();
        c.startVehical();
    }
}

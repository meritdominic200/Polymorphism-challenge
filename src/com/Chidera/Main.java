package com.Chidera;

class Car {
    private String name;
    private boolean Engine;
    private int wheels;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        Engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car >>> startEngine";
    }

    public String accelerate() {
        return "car >>> accelerate";
    }

    public String brake() {
        return " Car >>> brake";
    }

}

class Highlander extends Car {
    public Highlander(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Highlander >>> startEngine";
    }

    @Override
    public String accelerate() {
        return "Highlander >>> accelerate";
    }

    @Override
    public String brake() {
        return "Highlander >>> brake";
    }

}

class Golf extends Car {
    public Golf(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Golf >>> startEngine";
    }

    @Override
    public String accelerate() {
        return "Golf >>> accelerate";
    }

    @Override
    public String brake() {
        return "Golf >>> brake";
    }
}

class Honda extends Car {
    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Honda >>> startEngine";
    }

    @Override
    public String accelerate() {
        return "Honda >>> accelerate";
    }

    @Override
    public String brake() {
        return "Honda >>> brake";
    }
}

    public class Main {
        public static void main(String[] args) {
            Car car = new Car("base car", 6);
            System.out.println(car.accelerate());
            System.out.println(car.startEngine());
            System.out.println(car.brake());


            Highlander highlander = new Highlander("2020 model", 6);
            System.out.println(highlander.accelerate());
            System.out.println(highlander.startEngine());
            System.out.println(highlander.brake());

            Honda honda = new Honda("Accord", 6);
            System.out.println(honda.accelerate());
            System.out.println(honda.startEngine());
            System.out.println(honda.brake());

            Golf golf = new Golf("Accord", 6);
            System.out.println(golf.accelerate());
            System.out.println(golf.startEngine());
            System.out.println(golf.brake());


        }


    }



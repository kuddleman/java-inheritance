package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, String coat) {
        //super keyword is a reference variable which is used to
        // refer to the immediate parent class object
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    //override Animal eat method
    private void chew() {
        System.out.println("doggie is chewing!");
    }

    @Override
    public void eat() {
        System.out.println("special overriden doggie eat method");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Puppy is walking");
        move(5);
    }

    public void run() {
        System.out.println("Doggie is RUNNING!");
        move(10);
    }
}

package org.example;

abstract class Animal {
    public String name;

    public Animal(){
        this.name ="без имени";
    }

    public Animal(String Name){
        this.name = Name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void makeSound();
}
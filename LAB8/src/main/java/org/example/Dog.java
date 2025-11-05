package org.example;

public class Dog implements Animal, Interfese2 {
    public String name;

    public Dog(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
    @Override
    public void otInterfesa2(){}

}

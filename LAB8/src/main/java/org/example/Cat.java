package org.example;

public class Cat implements Animal {
    public String name;

    public Cat(String name) {
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
        System.out.println("Мяу");
    }


}

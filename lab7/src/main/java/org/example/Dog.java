package org.example;

 class Dog extends Animal {
    public String paroda;

    public Dog(String name, String Paroda){
        super(name);
        this.paroda = Paroda;
    }


    public void printInfo(){
        System.out.println("имя" + paroda);
    }
    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
}
package org.example;


class Belka {
    public String name;
    public int age;
    public String color;
    public String favoriteFood;

    public Belka() {
        this.name = "Безымянная";
        this.age = 1;
        this.color = "Коричневая";
        this.favoriteFood = "Орехи";
    }

    public Belka(String name, int age, String color, String favoriteFood) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.favoriteFood = favoriteFood;
    }

    public void jump() {
        System.out.println(name + " прыгает по деревьям");
    }

    protected void storeFood() {
        System.out.println(name + " прячет " + favoriteFood + " на зиму");
    }

    private void secretTunnel() {
        System.out.println(name + " уползла в дупло");
    }

    public void explore() {
        secretTunnel();
    }
}
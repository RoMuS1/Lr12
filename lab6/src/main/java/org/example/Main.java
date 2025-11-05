package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("z1");
        Belka s1 = new Belka();
        Belka s2 = new Belka("белка", 3, "Рыжая", "Жёлуди");

        s1.jump();
        s2.jump();
        s2.storeFood();
        s2.explore();


        System.out.println("z2");
        Text text = new Text("Приключения белки", new ArrayList<>());

        Predloj predloj1 = new Predloj();
        predloj1.addSlowo(new Slowo("Белка"));
        predloj1.addSlowo(new Slowo("прыгнула"));
        predloj1.addSlowo(new Slowo("на"));
        predloj1.addSlowo(new Slowo("ветку"));

        Predloj predloj2 = new Predloj();
        predloj2.addSlowo(new Slowo("Она"));
        predloj2.addSlowo(new Slowo("нашла"));
        predloj2.addSlowo(new Slowo("орех"));

        text.addSentence(predloj1);
        text.addSentence(predloj2);

        text.printTitle();
        text.printText();
    }
}

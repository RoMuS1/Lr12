package org.example;


import java.util.ArrayList;
import java.util.List;

class Text {
    private String title;
    private List<Predloj> predlojs = new ArrayList<>();

    public Text(String title, List<Predloj> predlojs) {
        this.title = title;
        this.predlojs = predlojs;
    }


    public void addSentence(Predloj predloj) {
        predlojs.add(predloj);
    }

    public void printTitle() {
        System.out.println("Заголовок: " + title);
    }

    public void printText() {
        for (Predloj predloj : predlojs) {
            System.out.println(predloj.getSentenceText());
        }
    }
}

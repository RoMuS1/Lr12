package org.example;
import java.util.ArrayList;
import java.util.List;

class Predloj {
    private List<Slowo> slowos = new ArrayList<>();


    public void addSlowo(Slowo slowo) {
        slowos.add(slowo);
    }

    public String getSentenceText() {
        StringBuilder sb = new StringBuilder();
        for (Slowo slowo : slowos) {
            sb.append(slowo.getContent()).append(" ");
        }
        return sb.toString().trim() + ".";
    }
}
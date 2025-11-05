package org.example;

public class KontraktnySotrudnik extends Sotrudnik {
    public KontraktnySotrudnik(String fio, String dolzhnost, double oklad) throws OkladException {
        super(fio, dolzhnost, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return getOklad(); // можно добавить логику контракта
        } catch (Exception e) {
            System.out.println("Ошибка расчёта зарплаты по контракту: " + e.getMessage());
            return 0;
        }
    }
}

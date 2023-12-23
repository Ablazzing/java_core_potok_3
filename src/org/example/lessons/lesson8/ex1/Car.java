package org.example.lessons.lesson8.ex1;

/**
 * Машина
 */
public class Car {
    //бензин
    private double fuel;

    public Car(double fuel) {
        this.fuel = fuel;
    }

    /**
     * Метод старта машины.
     * В случае отсутствия бензина выбрасывает исключение (throw new Exception)
     * Машина не может стартовать, если нет бензина, именно поэтому вначале есть проверка
     */
    public void start() throws Exception {
        if (fuel <= 0) {
            //если мы выбрасываем исключение, то выполнение метода прерывается
            throw new Exception("Нет топлива");
            //Код ниже не будет исполнен (вне if тоже не будет исполнен)
        }
        System.out.println("Машина стартует");
    }
}

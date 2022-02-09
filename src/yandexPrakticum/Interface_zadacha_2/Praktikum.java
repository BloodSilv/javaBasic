package yandexPrakticum.Interface_zadacha_2;

public class Praktikum {

    public static void main(String[] args) {
        Transport boat = new Boat(false);
        System.out.println("Является ли транспорт наземным: " + boat.isGround());

        GroundTransport motorcycle = new Motorcycle(true, 2);
        System.out.println("Является ли транспорт наземным: " + motorcycle.isGround());
        System.out.println("Количество колёс: " + motorcycle.getWheelsCount());

        GroundTransport car = new Car(true, 4);
        System.out.println("Является ли транспорт наземным: " + car.isGround());
        System.out.println("Количество колёс: " + car.getWheelsCount());

        Car sportcar = new Sportcar(true, 4);
        System.out.println("Является ли транспорт наземным: " + sportcar.isGround());
        System.out.println("Количество колёс: " + sportcar.getWheelsCount());
    }

}

interface Transport {
    boolean isGround();

    int getWheelsCount();
}

abstract class GroundTransport implements Transport {
    @Override
    public boolean isGround() {
        return false;
    }
}

class Boat implements Transport {

    private final boolean ground;

    public Boat(boolean ground) {
        this.ground = ground;
    }

    @Override
    public boolean isGround() {
        return ground;
    }

    @Override
    public int getWheelsCount() {
        return 0;
    }
}

class Motorcycle extends GroundTransport implements Transport {

    private final boolean ground;
    private final int wheelsCount;

    public Motorcycle(boolean ground, int wheelsCount) {
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean isGround() {
        return ground;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}

class Car extends GroundTransport implements Transport {

    private final boolean ground;
    private final int wheelsCount;

    public Car(boolean ground, int wheelsCount) {
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean isGround() {
        return ground;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}

class Sportcar extends Car {

    private final boolean ground;
    private final int wheelsCount;

    public Sportcar(boolean ground, int wheelsCount) {
        super(ground, wheelsCount);
        this.ground = ground;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean isGround() {
        return ground;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
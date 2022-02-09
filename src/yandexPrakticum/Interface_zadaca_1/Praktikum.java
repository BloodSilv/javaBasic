package yandexPrakticum.Interface_zadaca_1;

public class Praktikum {

    public static void main(String[] args) {
        Boat boat = new Boat(false);
        System.out.println("Является ли транспорт наземным: " + boat.isGround());

        Motorcycle motorcycle = new Motorcycle(true, 2);
        System.out.println("Является ли транспорт наземным: " + motorcycle.isGround());
        System.out.println("Количество колёс: " + motorcycle.getWheelsCount());

        Car car = new Car(true, 4);
        System.out.println("Является ли транспорт наземным: " + car.isGround());
        System.out.println("Количество колёс: " + car.getWheelsCount());

        Sportcar sportcar = new Sportcar(true, 4);
        System.out.println("Является ли транспорт наземным: " + sportcar.isGround());
        System.out.println("Количество колёс: " + sportcar.getWheelsCount());
    }

}

// в качестве корня иерархии всех транспортных средств используй интерфейс Transport
interface Transport {
    // ниже объяви методы, которые будут общими для всей иерархии классов
    boolean isGround();
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
}

class Motorcycle implements Transport {

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

class Car implements Transport {

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

class Sportcar implements Transport {

private final boolean ground;
private final int wheelsCount;

public Sportcar(boolean ground, int wheelsCount) {
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
package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        EletricCar eletricCar = new EletricCar();
        eletricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}

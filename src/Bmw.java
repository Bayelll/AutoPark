import java.util.List;
import Interfaces.*;

public class Bmw extends Car{
    public Bmw(String type, String model, String name, String color, String steeringWheelPosition, double engineVolume, String fuelType, int fuelTankCapacity, String transmission, String driveType, int horsepower, List<String> equipment) {
        super(type, model, name, color, steeringWheelPosition, engineVolume, fuelType, fuelTankCapacity, transmission, driveType, horsepower, equipment);
    }


    @Override
    public double overClocking() {
        if (getName().equals("F90")) {
            return 3.4;
        }

        if (getName().equals("G30")) {
            return 4.9;
        }

        if (getName().equals("X5")) {
            return 3.9;
        }

        if (getName().equals("X7")) {
            return 4.7;
        }

        System.out.println("Не верное название машины!");

        return 0;
    }

    @Override
    public boolean drift() {
        return getType().equals("Седан");
    }

    @Override
    public boolean drivingOnCrookedRoads() {
        return getType().equals("Внедорожник");
    }

    @Override
    public void gasolineConsumption() {
        changeFuel(2);
    }

    @Override
    public void refillingGasoline() {
        fullFuel();
    }
}

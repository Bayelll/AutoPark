import java.util.List;
import Interfaces.*;

public class MersedesBenz extends Car {
    public MersedesBenz(String type, String model, String name, String color, String steeringWheelPosition, double engineVolume, String fuelType, int fuelTankCapacity, String transmission, String driveType, int horsepower, List<String> equipment) {
        super(type, model, name, color, steeringWheelPosition, engineVolume, fuelType, fuelTankCapacity, transmission, driveType, horsepower, equipment);
    }


    @Override
    public double overClocking() {
        if (getName().equals("W222")) {
            return 6.1;
        }

        if (getName().equals("WW223")) {
            return 3.8;
        }

        if (getName().equals("CLS")) {
            return 7.0;
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

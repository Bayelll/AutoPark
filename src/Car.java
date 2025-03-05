import Interfaces.*;

import java.util.List;

import java.util.List;

public abstract class Car  implements Overclocking_from_0_to_100, Drift, Driving_On_Crooked_Roads, Gasoline_consumption, Refilling_gasoline { // Теперь класс абстрактный
    private String type; // Тип (седан)
    private String model; // Модель (BMW)
    private String name; // Название (F90)
    private String color; // Цвет (черный)
    private String steeringWheelPosition; // Руль (слева)
    private double engineVolume; // Объем двигателя (4.4)
    private String fuelType; // Тип топлива (бензин)
    private int fuelTankCapacity; // Вместимость бака (40 литров)
    private String transmission; // КПП (механика)
    private String driveType; // Привод (передний)
    private int horsepower; // Лошадиная сила (720)
    private List<String> equipment; // Комплектация (массив строк)

    public Car(String type, String model, String name, String color, String steeringWheelPosition,
               double engineVolume, String fuelType, int fuelTankCapacity, String transmission,
               String driveType, int horsepower, List<String> equipment) {
        this.type = type;
        this.model = model;
        this.name = name;
        this.color = color;
        this.steeringWheelPosition = steeringWheelPosition;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
        this.fuelTankCapacity = fuelTankCapacity;
        this.transmission = transmission;
        this.driveType = driveType;
        this.horsepower = horsepower;
        this.equipment = equipment;
    }

    // Геттеры и сеттеры
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public void setSteeringWheelPosition(String steeringWheelPosition) {
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(int fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public void changeFuel(int fuel) {
        this.fuelTankCapacity -= fuel;
    }

    public void fullFuel() {
        if(this.getType().equals("Седан")) {
            this.fuelTankCapacity = 40;
            return;
        }

        if(this.getType().equals("Внедорожник")) {
            this.fuelTankCapacity = 50;
            return;
        }
    }
}



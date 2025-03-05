public class Client {
    private Car car;

    Client(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + car.getType() + '\'' +
                ", model='" + car.getModel() + '\'' +
                ", name='" + car.getName() + '\'' +
                ", color='" + car.getColor() + '\'' +
                ", steeringWheelPosition='" + car.getSteeringWheelPosition() + '\'' +
                ", engineVolume=" + car.getEngineVolume() +
                ", fuelType='" + car.getFuelType() + '\'' +
                ", fuelTankCapacity=" + car.getFuelTankCapacity() + " л" +
                ", transmission='" + car.getTransmission() + '\'' +
                ", driveType='" + car.getDriveType() + '\'' +
                ", horsepower=" + car.getHorsepower() + " л.с." +
                ", equipment=" + car.getEquipment() +
                '}';
    }


}

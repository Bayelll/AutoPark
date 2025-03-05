public class CarPark {
    private Car[] cars = new Car[100];
    private int size = 0;
    private static CarPark carPark = null;

    private CarPark() {}

    public int getSize() {
        return size;
    }

    public void add(Car car) {
        if (size >= cars.length) {
            System.out.println("Парковка заполнена!");
            return;
        }
        cars[size] = car;
        size++;
    }

    public static CarPark newCarPark() {
        if(carPark == null) {
            carPark = new CarPark();
        }

        return carPark;
    }

    public Car getCar(String title) {
        for(Car car : cars) {
            if(car != null) {
                if(title.equals(car.getName())) {
                    return car;
                }
            }
        }
        return null;
    }

    public void printCars() {
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-6s | %-6s | %-8s | %-6s | %-10s | %-10s | %-4s |\n",
                "Тип", "Модель", "Название", "Цвет", "Руль", "Объем", "Топливо", "Бак", "КПП", "Привод", "Л.С.");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < size; ++i) {
            Car car = cars[i];
            System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-6s | %-6.1f | %-8s | %-6d | %-10s | %-10s | %-4d |\n",
                    car.getType(), car.getModel(), car.getName(), car.getColor(), car.getSteeringWheelPosition(),
                    car.getEngineVolume(), car.getFuelType(), car.getFuelTankCapacity(), car.getTransmission(),
                    car.getDriveType(), car.getHorsepower());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        // Вывод комплектации
        for (int i = 0; i < size; ++i) {
            System.out.println("Комплектация " + cars[i].getName() + ": " + cars[i].getEquipment());
        }
    }

}

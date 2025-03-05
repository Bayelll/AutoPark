import Interfaces.Overclocking_from_0_to_100;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Машины в наличии");

        CarPark carPark = CarPark.newCarPark();

        List<String> equipmentF90 = new ArrayList<>();
        equipmentF90.add("Люк (Имеется)");
        equipmentF90.add("Шторы (Имеются)");
        equipmentF90.add("Диски (Титановые)");
        equipmentF90.add("Карбон (Имеется)");
        equipmentF90.add("Выхлоп (Akrapovic)");

        Bmw f90 = new Bmw(
                "Седан", "BMW", "F90", "Черный", "Левый",
                4.4, "Бензин", 68, "Автомат", "Полный", 625, equipmentF90
        );
        carPark.add(f90);

        List<String> equipmentG30 = new ArrayList<>();
        equipmentG30.add("Люк (Не Имеется)");
        equipmentG30.add("Шторы (Не Имеются)");
        equipmentG30.add("Диски (Титановые)");
        equipmentG30.add("Карбон (Имеется)");
        equipmentG30.add("Выхлоп (Akrapovic)");

        Bmw g30 = new Bmw(
                "Седан", "BMW", "G30", "Белый", "Левый",
                3.0, "Дизель", 68, "Автомат", "Задний", 400, equipmentG30
        );
        carPark.add(g30);

        List<String> equipmentX5 = new ArrayList<>();
        equipmentX5.add("Люк (Имеется)");
        equipmentX5.add("Шторы (Не Имеются)");
        equipmentX5.add("Диски (Легкосплавные)");
        equipmentX5.add("Карбон (Отсутствует)");
        equipmentX5.add("Выхлоп (M Performance)");

        Bmw x5 = new Bmw(
                "Внедорожник", "BMW", "X5", "Синий", "Левый",
                3.0, "Дизель", 80, "Автомат", "Полный", 400, equipmentX5
        );

        carPark.add(x5);

        List<String> equipmentW222 = new ArrayList<>();
        equipmentW222.add("Люк (Имеется)");
        equipmentW222.add("Шторы (Имеются)");
        equipmentW222.add("Диски (Хромированные)");
        equipmentW222.add("Карбон (Отсутствует)");
        equipmentW222.add("Выхлоп (AMG Performance)");

        MersedesBenz w222 = new MersedesBenz(
                "Седан", "Mercedes-Benz", "W222", "Черный", "Левый",
                4.0, "Бензин", 75, "Автомат", "Полный", 469, equipmentW222
        );
        carPark.add(w222);

        List<String> equipmentW223 = new ArrayList<>();
        equipmentW223.add("Люк (Имеется)");
        equipmentW223.add("Шторы (Имеются)");
        equipmentW223.add("Диски (Легкосплавные)");
        equipmentW223.add("Карбон (Имеется)");
        equipmentW223.add("Выхлоп (AMG Sport)");

        MersedesBenz w223 = new MersedesBenz(
                "Седан", "Mercedes-Benz", "W223", "Серебристый", "Левый",
                3.0, "Гибрид", 80, "Автомат", "Полный", 510, equipmentW223
        );
        carPark.add(w223);

        List<String> equipmentCLS = new ArrayList<>();
        equipmentCLS.add("Люк (Не имеется)");
        equipmentCLS.add("Шторы (Не имеются)");
        equipmentCLS.add("Диски (Титановые)");
        equipmentCLS.add("Карбон (Имеется)");
        equipmentCLS.add("Выхлоп (Стандартный)");

        MersedesBenz cls = new MersedesBenz(
                "Седан", "Mercedes-Benz", "CLS", "Красный", "Левый",
                2.9, "Дизель", 66, "Автомат", "Задний", 340, equipmentCLS
        );
        carPark.add(cls);


        carPark.printCars();

        System.out.println("Выберите машину по названии: например (F90)");

        String choice = scanner.next();



        Car choicedCar = carPark.getCar(choice);

        Client client;

        if(choicedCar == null) {
            System.out.println("Машины нет");
            return;
        }
        else {
            client = new Client(choicedCar);


        }

        System.out.println("Вы выбрали: " + client);


        while (true){
            System.out.println("Выбери вариант");
            System.out.println("1: Разгон до 100");
            System.out.println("2: Дрифт");
            System.out.println("3: Ездить по не ровным дорогам");
            System.out.println("4: Пополнить бак");
            System.out.println("5: Покинуть");
            System.out.println("Бензин в баке = " + choicedCar.getFuelTankCapacity());
            if(choicedCar.getFuelTankCapacity() <= 5) {
                System.out.println("Пополните бак!");
                int fullFuel = scanner.nextInt();
                if(fullFuel == 4) {
                    choicedCar.fullFuel();
                }
                continue;
            }
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Ваша машина от 0 до 100, разгоняется за = " + choicedCar.overClocking() + " секунд!");
                    choicedCar.changeFuel(3);
                    break;
                case 2:
                    if(choicedCar.drift()) {
                        System.out.println("Круто что у тебя седан!!, ты дал жару");
                    }
                    else {
                        System.out.println("На внедорожнике тоже можно дрифтить :)");
                    }
                    choicedCar.changeFuel(2);
                    break;
                case 3:
                    if(choicedCar.drivingOnCrookedRoads()) {
                        System.out.println("Хорошо что у тебя внедорожник, ты король этих дорог");
                    }
                    else {
                        System.out.println("Езжай только по медленее!");
                    }
                    break;
                case 4:
                    System.out.println("Бензин достаточен");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Не верные данные");
                    continue;
            }

        }
    }
}
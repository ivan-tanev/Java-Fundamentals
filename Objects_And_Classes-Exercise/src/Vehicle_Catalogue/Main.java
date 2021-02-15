package Vehicle_Catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        int carsHorsePower = 0;
        int trucksHorsePower = 0;

        String input = term.nextLine();
        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsePower = Integer.parseInt(tokens[3]);
            if ("car".equals(type)) {
                Car car = new Car(model, color, horsePower);
                carsHorsePower += car.getHorsePower();
                cars.add(car);
            } else if ("truck".equals(type)) {
                Truck truck = new Truck(model, color, horsePower);
                trucksHorsePower += truck.getHorsePower();
                trucks.add(truck);
            }

            input = term.nextLine();
        }
        input = term.nextLine();

        while (!"Close the Catalogue".equals(input)) {
            for (Car car : cars) {
                if (car.getModel().equals(input)) {
                    System.out.println(car);
                    break;
                }
            }
            for (Truck truck : trucks) {
                if (truck.getModel().equals(input)) {
                    System.out.println(truck);
                    break;
                }
            }

            input = term.nextLine();
        }
        double averageCarHorsePower = 0;
        if (cars.size() != 0) {
            averageCarHorsePower = carsHorsePower * 1.0 / cars.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsePower);

        double averageTruckHorsePower = 0;
        if (trucks.size() != 0) {
            averageTruckHorsePower = trucksHorsePower * 1.0 / trucks.size();
        }
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHorsePower);
    }
}

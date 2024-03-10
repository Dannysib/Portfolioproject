import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            //instance of auto class with parameters
            Auto vehicle = new Auto("Ford", "Mustang", "Blue", 2010, 20000);
            //method called to list cars
            String[] carInfo = vehicle.listOfCars();
            for (String info : carInfo) {
                System.out.println(info);
            }
            //print return for removeCar method
            System.out.println(vehicle.removeCar());
            //add new vehicle
            System.out.println(vehicle.addCar("Ford", "f150", "White", 2010, 150000));
            //print new car
            carInfo = vehicle.listOfCars();
            for (String info : carInfo) {
                System.out.println(info);
            }
            //update car
            System.out.println(vehicle.updateCarInfo("Ford", "f150", "Red", 2010, 150000));
            //print updated car
            carInfo = vehicle.listOfCars();
            for (String info : carInfo) {
                System.out.println(info);
            }
            //ask if User wants to print info to a file
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to print the information to a file? (Y/N)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("Y")) {
                printToFile(carInfo);
                System.out.println("File printed successfully.");
            } else {
                System.out.println("File will not be printed.");
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //method to print to txt file
    private static void printToFile(String[] carInfo) {
        try {
            FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt");
            for (String info : carInfo) {
                writer.write(info + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }
    }
}


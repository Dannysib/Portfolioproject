public class Auto {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
   //default constructor
    public Auto() {
    }
    //parameterized constructor
    public Auto(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
   //add new car method
    public String addCar(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle added.";
        } catch (Exception e) {
            return "Failed to add vehicle: " + e.getMessage();
        }
    }
   //list car info method
    public String[] listOfCars() {
        try {
            return new String[]{this.make, this.model, this.color, String.valueOf(this.year), String.valueOf(this.mileage)};
        } catch (Exception e) {
            return new String[]{"Failed to show list: " + e.getMessage()};
        }
    }
    //remove car method
    public String removeCar() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed.";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }
    //update car method
    public String updateCarInfo(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle attributes updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle attributes: " + e.getMessage();
        }
    }
}




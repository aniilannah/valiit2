package DayFive;

public class Car {
    //Properties (fields) of the class
    String brand;
    String model;
    int year;

    // Default constructor
    public Car (){
        // Initialize default values
        brand = "BMW";
        model = "X5";
        year = 2018;
    }

    // Parameterized constructor
    public Car (String brand, String model, int year){
        this.brand = brand; // this is used to eliminate the confusion between class attributes and parameters with the same name
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        // Creating object of the Car class
        Car car1 = new Car("Honda", "Civic", 2010);
        Car car2 = new Car();

        // Calling the method to display details of each car
        car1.displayDetails();
        car2.displayDetails();
    }
    //Method to display car details
    private void displayDetails(){

        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
    }

}

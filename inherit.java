class Vehicles {
    String brand;
    String transmission;

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Cars extends Vehicles {
    String model;
    int year;
    String color;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Cars myCar = new Cars();
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        myCar.color = "Blue";
        myCar.transmission = "Automatic";

        myCar.start();
        myCar.displayInfo();
    }
}

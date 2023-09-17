package Classes;

import java.util.ArrayList;

import java.util.Scanner;

public class Car {
    private String Brand;
    private String Model;
    private int HorsePower;

    public Car(String Brand, String Model, int HorsePower) {
        this.Brand = Brand;
        this.Model = Model;
        this.HorsePower = HorsePower;
    }

    public Car(String Brand) {
        this.Brand = Brand;
        this.Model = "unknown";
        this.HorsePower = -1;
    }

    public Car(String Brand, String Model) {
        this.Brand = Brand;
        this.Model = Model;
        this.HorsePower = -1;
    }

    public Car(String[] arr) {
        if (arr.length == 1) {
            this.Brand = arr[0];
            this.Model = "unknown";
            this.HorsePower = -1;
        }
        if (arr.length == 2) {
            this.Brand = arr[0];
            this.Model = arr[1];
            this.HorsePower = -1;
        }
        if (arr.length == 3) {
            this.Brand = arr[0];
            this.Model = arr[1];
            this.HorsePower = Integer.parseInt(arr[2]);
        }
    }


    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return this.Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }


    public int getHorsePower() {
        return this.HorsePower;
    }

    public void setHorsePower(int horsePower) {
        this.HorsePower = horsePower;
    }

    public String getCarInfo() {
        return String.format("The car is %s %s – %d HP.", this.Brand, this.Model, this.HorsePower);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Car> listOfCars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split("\\s* \\s*");
            Car car = new Car(arr);
            listOfCars.add(car);
        }

        for (int i = 0; i < listOfCars.size(); i++) {
            System.out.println(listOfCars.get(i).getCarInfo());
        }
    }
}

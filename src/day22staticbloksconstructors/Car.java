package day22staticbloksconstructors;

public class Car {
    
    String make="Honda";
    String model="Accord";
    int year=2023;
    boolean hybrid=true;
    
    Car(String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;
    }

    public Car(String bmw, String m4, String s, String aFalse) {
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}

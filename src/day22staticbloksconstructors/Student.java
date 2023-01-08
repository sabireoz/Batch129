package day22staticbloksconstructors;

public class Student {
    String name;
    int age;
    String stdId;
    String address;


    public Student(String name, int age, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
        this.address = address;
    }

    public Student(String ali_can, String s, String ac13G7, String istanbul) {
    }

    public Student(String tom_hanks, String s, String th21G12) {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

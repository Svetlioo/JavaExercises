package Classes;


import java.util.ArrayList;
import java.util.Scanner;


public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Students(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
        studentList.add(this);
    }

    private static ArrayList<Students> studentList = new ArrayList<>();

    public Students(String input) {
        String[] inputArr = input.split(" ");
        this.firstName = inputArr[0];
        this.lastName = inputArr[1];
        this.age = Integer.parseInt(inputArr[2]);
        this.hometown = inputArr[3];
        studentList.add(this);
    }


    public static void printStudentByCity(String city) {
        for (int i = 0; i < studentList.size(); i++) {
            Students student = studentList.get(i);
            if (student.hometown.equals(city)) {
                System.out.printf("%s %s is %d years old.%n", student.firstName, student.lastName, student.age);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) break;
            new Students(input);
        }

        String city = sc.nextLine();
        printStudentByCity(city);
    }
}

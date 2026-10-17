//Question 5  Prime High School student register (login, register, marks, display)
import java.util.Scanner;

public class SchoolRegister {

    //let's create one Scanner and the arrays that will keep the students information
    static Scanner input = new Scanner(System.in);
    static String[] names;
    static String[] regNumbers;
    static String[] subjects;
    static String[] classes;
    static double[] marks;
    static int n = 0;

    //let's define the method that checks the username and password (3 tries only)
    public static boolean login () {
        int x = 0;

        while (x < 3) {
            System.out.print("Enter username: ");
            String username = input.nextLine();
            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (username.equals("Kinyonyi David") && password.equals("OOP2026")) {
                System.out.println("Login successful. Welcome "+ (username)+ "!");
                return true;
            }

            x++;
            System.out.println("Wrong username or password. Tries left: " + (3 - x));
        }

        return false;
    }

    //let's define the method that registers the students
    public static void registerStudents () {
        System.out.print("How many students are you going to register?: ");
        n = input.nextInt();
        input.nextLine();

        names = new String[n];
        regNumbers = new String[n];
        subjects = new String[n];
        classes = new String[n];
        marks = new double[n];

        int x = 0;

        while (x < n) {
            System.out.println("Student number " + (x + 1));

            System.out.print("Enter student name: ");
            names[x] = input.nextLine();

            System.out.print("Enter registration number: ");
            regNumbers[x] = input.nextLine();

            System.out.print("Enter subject: ");
            subjects[x] = input.nextLine();

            System.out.print("Enter class: ");
            classes[x] = input.nextLine();
            System.out.print("_________________________________________ ");
            System.out.println();
            x++;
        }
    }

    //let's define the method that records the marks of each student
    public static void recordMarks () {
        int x = 0;

        while (x < n) {
            System.out.print("Enter the marks of " + names[x] + ": ");
            marks[x] = input.nextDouble();
            x++;
        }
        input.nextLine();
    }

    //let's define the method that shows all registered students and their marks
    public static void displayStudents () {
        System.out.println();
        System.out.println("Here are all the registered students:");

        int x = 0;

        while (x < n) {
            System.out.println("Name: " + names[x] + " | Reg No: " + regNumbers[x]
                    + " | Subject: " + subjects[x] + " | Class: " + classes[x]
                    + " | Marks: " + marks[x]);
            x++;
        }
    }

    //let's call all the methods in main ()
    public static void main(String[] args) {
        boolean loggedIn = login();

        if (loggedIn) {
            registerStudents();
            recordMarks();
            displayStudents();
        } else {
            System.out.println("Too many wrong tries. Access blocked.");
        }

        input.close();
    }
}

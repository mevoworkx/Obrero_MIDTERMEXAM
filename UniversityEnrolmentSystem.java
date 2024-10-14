// Base class representing a person
class Person {
    protected String name; 
    protected int age;     

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass 
class Student extends Person {
    private String studentID;  
    private String course;      
    private int units;          
    private static final int feePerUnit = 1000; 

    // Constructor to initialize student's fields
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Call the constructor of the base class
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate total fees for the student
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Override displayInfo to include specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.printf("Student ID: %s, Course: %s, Units: %d, Total Fee: %.2f%n", 
                          studentID, course, units, calculateFees());
    }
}
// Subclass 
class Instructor extends Person {
    private String employeeID; 
    private String department; 
    private double salary;      

    // Constructor to initialize instructor's fields
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call the constructor of the base class
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override displayInfo to include specific information
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the base class method
        System.out.printf("Employee ID: %s, Department: %s, Salary: %.2f%n", 
                          employeeID, department, salary);
    }
}
public class UniversityEnrolmentSystem {

    // Method to demonstrate polymorphism
    public static void printDetails(Person p) {
        p.displayInfo(); // Calls the appropriate displayInfo() method
    }

    public static void main(String[] args) {
        
        Student student1 = new Student("Mario", 20, "231002020", "Data System Analysis", 12);
        Student student2 = new Student("Maria", 24, "231002121", "Engineering Economics", 22);

   
        Instructor instructor1 = new Instructor("Tanya", 26, "12345", "Data System Analysis", 75000);
        Instructor instructor2 = new Instructor("Sarahlyn", 50, "54321", "Engineering Economics", 85000);

    
        System.out.println("Student Information:");
        printDetails(student1); // Calls displayInfo 
        printDetails(student2); 

        System.out.println("\nInstructor Information:");
        printDetails(instructor1); // Calls displayInfo 
        printDetails(instructor2); 
    }
}
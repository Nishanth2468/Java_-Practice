class person {
    String name;
    int age;

    // Constructor
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails(){
        System.out.println("Name: " + name + ", Age: " + age);
    }

}

// Faculty class inheriting from person class
class Faculty extends person {
    String department;
    String designation;

    // Constructor
    public Faculty(String name, int age, String department, String designation) {
        super(name, age);
        this.department = department;
        this.designation = designation;
    }

    // Overridden method to display faculty details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department + ", Designation: " + designation);
    }
}

// HOD class inherits from Faculty
class HOD extends Faculty {
    int yearsAsHOD;

    // Constructor
    public HOD(String name, int age, String department, String designation, int yearsAsHOD) {
        super(name, age, department, designation); // Call Faculty constructor
        this.yearsAsHOD = yearsAsHOD;
    }

    // Overridden method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Show Faculty (and Person) details
        System.out.println("Years as HOD: " + yearsAsHOD);
    }
}


public class Hierarchy  {
    public static void main(String[] args) {
        // Create a Object
        person p = new person("Alice", 40);
        Faculty f = new Faculty("Bob", 35, "Computer Science", "Assistant Professor");
        HOD h = new HOD("Charlie", 50, "Electrical", "Professor", 5);

        System.out.println("=== Person Details ===");
        p.displayDetails();

        System.out.println("\n=== Faculty Details ===");
        f.displayDetails();

        System.out.println("\n=== HOD Details ===");
        h.displayDetails();
    }
}

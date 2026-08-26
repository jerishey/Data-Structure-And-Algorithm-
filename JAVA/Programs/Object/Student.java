package Object;

class Student {

    private int rollNo;
    private String name;
    private double marks;

    // Constructor
    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Calculate grade
    char getGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else if (marks >= 40)
            return 'D';
        else
            return 'F';
    }

    // Check which student has higher marks
    void compareMarks(Student other) {

        if (this.marks > other.marks) {
            System.out.println(
                this.name + " scored higher than " + other.name
            );
        } 
        else if (this.marks < other.marks) {
            System.out.println(
                other.name + " scored higher than " + this.name
            );
        } 
        else {
            System.out.println(
                this.name + " and " + other.name + " have equal marks"
            );
        }
    }

    // Display student information
    void display() {
        System.out.println("-------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("Grade   : " + getGrade());
    }

    public static void main(String[] args) {

        // Creating individual objects
        Student s1 = new Student(101, "Rakesh", 87);
        Student s2 = new Student(102, "Aman", 92);
        Student s3 = new Student(103, "Rahul", 76);

        // Display objects
        s1.display();
        s2.display();
        s3.display();

        // Comparing objects
        System.out.println("\nComparison:");

        s1.compareMarks(s2);
        s2.compareMarks(s3);
        s1.compareMarks(s3);

        // Array of objects
        Student[] students = {s1, s2, s3};

        System.out.println("\nStudents using Object Array:");

        for (Student student : students) {
            student.display();
        }
    }
}
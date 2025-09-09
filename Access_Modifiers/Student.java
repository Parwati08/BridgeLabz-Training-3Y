// Base class
class Student {
    public int rollNumber;           // public
    protected String name;           // protected
    private double CGPA;             // private

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access and modify private CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {
    String thesisTitle;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    void displayPostgradDetails() {
        // Can access protected name from superclass
        System.out.println("PG Student: " + name + ", Thesis: " + thesisTitle);
    }
}

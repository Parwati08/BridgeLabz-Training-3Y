// Base class
class Employee {
    public int employeeID;           // public
    protected String department;     // protected
    private double salary;           // private

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: ₹" + salary);
    }
}

// Subclass
class Manager extends Employee {
    int teamSize;

    Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    void displayManagerDetails() {
        // Can access public and protected
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team Size: " + teamSize);
    }
}

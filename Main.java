import java.util.*;
// DevOpsEngineer class extending Employee
class DevOpsEngineer extends Employee {
    private double bonus;

    // Constructor
    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    // Calculate total salary including bonus
    @Override
    public void displayDetails() {
        super.displayDetails();
        double totalSalary = salary + bonus;
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary (including bonus): $" + totalSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp1 = new Employee("John Doe", 1001, 50000);
        // Display employee details
        System.out.println("Employee Details:");
        emp1.displayDetails();
        
        // Create an instance of DevOpsEngineer
        DevOpsEngineer devOps1 = new DevOpsEngineer("Alice Smith", 1002, 60000, 10000);
        // Display DevOps engineer details
        System.out.println("\nDevOps Engineer Details:");
        devOps1.displayDetails();
    }
}

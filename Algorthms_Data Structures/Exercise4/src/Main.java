class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
    }
}

class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            resizeArray();
        }
        employees[size++] = employee;
    }

    private void resizeArray() {
        Employee[] newArray = new Employee[employees.length * 2];
        System.arraycopy(employees, 0, newArray, 0, employees.length);
        employees = newArray;
    }

    public Employee searchEmployeeById(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployeeById(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public void displayAllEmployees() {
        for (int i = 0; i < size; i++) {
            employees[i].displayEmployee();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(2);

        Employee e1 = new Employee(1, "Alice", "Developer", 50000);
        Employee e2 = new Employee(2, "Bob", "Designer", 40000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);

        System.out.println("All Employees:");
        ems.displayAllEmployees();

        System.out.println("Searching for Employee with ID 1:");
        Employee found = ems.searchEmployeeById(1);
        if (found != null) {
            found.displayEmployee();
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("Deleting Employee with ID 2:");
        ems.deleteEmployeeById(2);

        System.out.println("All Employees after deletion:");
        ems.displayAllEmployees();
    }
}

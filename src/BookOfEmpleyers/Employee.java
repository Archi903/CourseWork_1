package BookOfEmpleyers;

public class Employee {

    private int department;
    private double salary;
    private final String name;
    private final int id;

    private static int counter = 1;


    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter += 1;
    }


    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", ФИО:" + name + ", департамент: " + department + ", зарплата: " + salary;
    }

}




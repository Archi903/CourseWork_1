package BookOfEmpleyers;

public class Employee {

    public int department;
    public int salary;
    public String name;
    public int id;

    private static int counter = 1;



    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter += 1;
    }


    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", ФИО:" + name + ", департамент: " + department + ", зарплата: " + salary;
    }

}



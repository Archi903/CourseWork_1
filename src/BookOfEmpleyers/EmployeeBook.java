package BookOfEmpleyers;

public class EmployeeBook {
    private static final

    Employee[] employee = new Employee[]{

            new Employee("Иванов Иван Иванович", 1, 70000),
            new Employee("Петров Илья Григорьевич", 3, 45000),
            new Employee("Киселева Марианна Михайловна", 5, 33000),
            new Employee("Курчатов Василий Игоревич", 4, 61000),
            new Employee("Коновалова Злата Ивановна", 2, 76000),
            new Employee("Лобанов Дмитрий Александрович", 4, 65000),
            new Employee("Матвеев Роман Ильич", 3, 94000),
            new Employee("Кочетов Давид Андреевич", 5, 55000),
            new Employee("Кузнецов Фёдор Алексеевич", 1, 72000),
            new Employee("Борисов Даниил Иванович", 2, 39000)
    };

    public void printEmployers() {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public void settingsDepartmentSalary() {
        employee[2].setDepartment(4);   // Поменять департамент
        employee[2].setSalary(47000);   // Поменять зарплату
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public double calculateMonthAllSalary() {
        double sumMonth = 0;
        for (Employee current : employee) {
            sumMonth = sumMonth + current.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты составила " + sumMonth);
        System.out.print("**********************************************************************************");
        System.out.println(" ");
        return sumMonth;
    }

    public void calculateMinSalary() {

        String minEmployee = null;
        double minSum = employee[0].getSalary();
        for (Employee value : employee) {
            if (minSum >= value.getSalary()) {
                minEmployee = value.getName();
                minSum = value.getSalary();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника:" + minEmployee + ", зарплата: " + minSum + " рублей");
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void calculateMaxSalary() {

        String maxEmployee = null;
        double maxSum = employee[0].getSalary();
        for (Employee value : employee) {
            if (maxSum <= value.getSalary()) {
                maxSum = value.getSalary();
                maxEmployee = value.getName();
            }
        }
        System.out.println("Максимальная зарплата у сотрудника:" + maxEmployee + ", зарплата: " + maxSum + " рублей");
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void calculateAverageSalary() {

        double averageMonth = calculateMonthAllSalary() / employee.length;
        System.out.println(averageMonth);

        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void fullName() {
        String employeeName;
        for (Employee value : employee) {
            employeeName = value.getName();
            System.out.println("ФИО: " + employeeName);
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void growSalary() {
        double percent = 5;
        double growSalary;
        for (Employee value : employee) {
            growSalary = value.getSalary() + (value.getSalary() * percent / 100);
            value.setSalary(growSalary);
            System.out.println("Для сотрудника: " + value.getName() + ", из отдела: " + value.getDepartment() + ", зарплата прошла индексацию: " + value.getSalary());
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void minEmployeeDepartment(int department) {

        String minEmployee = null;
        double minSum = 3000000;
        for (Employee value : employee) {
            if (minSum >= value.getSalary() && department == value.getDepartment()) {
                minEmployee = value.getName();
                minSum = value.getSalary();
                department = value.getDepartment();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника:" + minEmployee + ", департамент: " + department + ", зарплата: " + minSum + " рублей");
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void maxEmployeeDepartment(int department) {
        String maxEmployee = null;
        double maxSum = 0;
        for (Employee value : employee) {
            if (maxSum < value.getSalary() && department == value.getDepartment()) {
                maxEmployee = value.getName();
                maxSum = value.getSalary();
                department = value.getDepartment();
            }
        }
        System.out.println("Максимальная зарплата у сотрудника:" + maxEmployee + ", департамент: " + department + ", зарплата: " + maxSum + " рублей");
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void totalSalaryMonth(int department) {
        double sumMonth = 0;
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                sumMonth = sumMonth + value.getSalary();
            }
        }
        System.out.println("Сумму затрат на зарплату по отделу №" + department + ": " + sumMonth);
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void averageSalaryDepartment(int department) {

        double employersSum = 0;
        int countEmployee = 0;
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                countEmployee = countEmployee + 1;
                employersSum = employersSum + value.getSalary();
            }
        }
        double averageSalary = employersSum / countEmployee;
        System.out.println("Средняя зарплату по отделу №" + department + ": " + averageSalary);
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void selectGrowSalary(double percent) {
        double growSalary;
        for (Employee value : employee) {
            growSalary = value.getSalary() + (value.getSalary() * percent / 100);
            value.setSalary(growSalary);
            System.out.println("Для сотрудника: " + value.getName() + ", из отдела: " + value.getDepartment() + ", зарплата прошла индексацию: " + value.getSalary());
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void printNameAndSalary(int department) {
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                String employName = value.getName();
                double employSalary = value.getSalary();
                System.out.println("Имя сотрудника: " + employName + ", зарплата: " + employSalary);
                System.out.print("**********************************************************************************");
                System.out.println(" ");
            }
        }
    }

    public void salaryLow(int printSalary) {
        for (Employee value : employee) {
            if (printSalary > value.getSalary()) {
                System.out.println(value);
            }
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public void salaryHigh(int printSalary) {
        for (Employee value : employee) {
            if (printSalary <= value.getSalary()) {
                System.out.println(value);
            }
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }


    public static void removeEmployeeName(String selectName) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getName().equals(selectName)) {
                employee[i] = null;
            }
        }
    }

    public static int findEmptyEmployee() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void addNewEmployee(String name, int department, double salary) {
        int s = findEmptyEmployee();
        if (s == -1) {
            System.out.println("Свободных мест нет");
            return;
        }
        employee[s] = new Employee(name, department, salary);
    }

    public static void changeDepartmentAndSalary(String selectName, int department, int salary) {
        for (int index = 0; index < employee.length; index++) {
            if (employee[index].getName().equals(selectName)) {
                employee[index] = new Employee(employee[index].getName(), department, salary);
            }
        }
    }
    public static void printDepartmentAndName(int amountOfDepartment) {
        for (int i = 1; i <= amountOfDepartment; i++) {
            System.out.println("Департамент " + i + ":");
            for (Employee employee : employee) {
                if (employee.getDepartment() == i){
                    System.out.println("ФИО: " + employee.getName());
                }
            }
        }
    }

    public static void main(String[] args) {

        removeEmployeeName("Иванов Иван Иванович");
        addNewEmployee("Петров Владимир Николаевич", 2, 90000);
        changeDepartmentAndSalary("Борисов Даниил Иванович", 3, 120_000);
        printDepartmentAndName(5);
        }



    public void allMethods(String[] args) {
        printEmployers();
        settingsDepartmentSalary();
        calculateMonthAllSalary();
        calculateMinSalary();
        calculateMaxSalary();
        calculateAverageSalary();
        fullName();
        growSalary();
        int department = 2;
        minEmployeeDepartment(department);
        maxEmployeeDepartment(department);
        totalSalaryMonth(department);
        averageSalaryDepartment(department);
        double percent = 20;
        selectGrowSalary(percent);
        printNameAndSalary(department);
        int printSalary = 60000;
        salaryLow(printSalary);
        salaryHigh(printSalary);

    }

}
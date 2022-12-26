package BookOfEmpleyers;

public class Main {
    public static final Employee[] employee = {

            new Employee("Иванов Иван Иванович", 1, 70000),
            new Employee("Петров Илья Григорьевич", 3, 45000),
            new Employee("Курчатов Василий Игоревич", 4, 61000),
            new Employee("Киселева Марианна Михайловна", 5, 33000),
            new Employee("Коновалова Злата Ивановна", 2, 76000),
            new Employee("Лобанов Дмитрий Александрович", 4, 65000),
            new Employee("Матвеев Роман Ильич", 3, 94000),
            new Employee("Кочетов Давид Андреевич", 5, 55000),
            new Employee("Кузнецов Фёдор Алексеевич", 1, 72000),
            new Employee("Борисов Даниил Иванович", 2, 39000)
    };

    public static void printEmployers() {
        for (Employee value : employee) {
            System.out.println(value);
        }
    }

    public static void settingsDepartment(int chooseEmployeeDepartment, int changeDepartment) {
        chooseEmployeeDepartment = chooseEmployeeDepartment - 1;
        employee[chooseEmployeeDepartment].setDepartment(changeDepartment);   // Поменять департамент
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public static void settingsSalary(int chooseEmployeeSalary, int changeSalary) {
        chooseEmployeeSalary = chooseEmployeeSalary - 1;
        employee[chooseEmployeeSalary].setSalary(changeSalary);   // Поменять зарплату
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public static double calculateMonthAllSalary() {
        double sumMonth = 0;
        for (Employee current : employee) {
            sumMonth = sumMonth + current.getSalary();
        }

        return sumMonth;
    }

    public static String calculateMinSalary() {

        String minEmployee = null;
        double minSum = employee[0].getSalary();
        for (Employee value : employee) {
            if (minSum >= value.getSalary()) {
                minEmployee = value.getName();
                minSum = value.getSalary();
            }
        }
        return minEmployee;
    }

    public static String calculateMaxSalary() {

        String maxEmployee = null;
        double maxSum = employee[0].getSalary();
        for (Employee value : employee) {
            if (maxSum <= value.getSalary()) {
                maxSum = value.getSalary();
                maxEmployee = value.getName();
            }
        }
        return maxEmployee;
    }

    public static double calculateAverageSalary() {

        return calculateMonthAllSalary() / employee.length;
    }

    public static void fullName() {
        String employeeName;
        for (Employee value : employee) {
            employeeName = value.getName();
            System.out.println("ФИО: " + employeeName);
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public static void growSalary(double percent) {
        double growSalary;
        for (Employee value : employee) {
            growSalary = value.getSalary() + (value.getSalary() * percent / 100);
            value.setSalary(growSalary);
            System.out.println("Для сотрудника: " + value.getName() + ", из отдела: " + value.getDepartment() + ", зарплата прошла индексацию: " + value.getSalary());
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public static String minEmployeeDepartment(int department) {

        String minEmployee = null;
        double minSum = employee[0].getSalary();
        for (Employee value : employee) {
            if (minSum >= value.getSalary() && department == value.getDepartment()) {
                minEmployee = value.getName();
                minSum = value.getSalary();
                department = value.getDepartment();
            }
        }
        return minEmployee;
    }

    public static String maxEmployeeDepartment(int department) {
        String maxEmployee = null;
        double maxSum = employee[0].getSalary();
        for (Employee value : employee) {
            if (maxSum < value.getSalary() && department == value.getDepartment()) {
                maxEmployee = value.getName();
                maxSum = value.getSalary();
                department = value.getDepartment();
            }
        }
        return maxEmployee;
    }

    public static double totalSalaryMonth(int department) {
        double sumMonth = 0;
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                sumMonth = sumMonth + value.getSalary();
            }
        }
        return sumMonth;
    }

    public static double averageSalaryDepartment(int department) {

        double employersSum = 0;
        int countEmployee = 0;
        for (Employee value : employee) {
            if (department == value.getDepartment()) {
                countEmployee = countEmployee + 1;
                employersSum = employersSum + value.getSalary();
            }
        }
        return employersSum / countEmployee;
    }

    public static void selectGrowSalary(double percent) {
        double growSalary;
        for (Employee value : employee) {
            growSalary = value.getSalary() + (value.getSalary() * percent / 100);
            value.setSalary(growSalary);
            System.out.println("Для сотрудника: " + value.getName() + ", из отдела: " + value.getDepartment() + ", зарплата прошла индексацию: " + value.getSalary());
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public static void printNameAndSalary(int department) {
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

    public static void salaryLow(int printSalary) {
        for (Employee value : employee) {
            if (printSalary > value.getSalary()) {
                System.out.println(value);
            }
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public static void salaryHigh(int printSalary) {
        for (Employee value : employee) {
            if (printSalary <= value.getSalary()) {
                System.out.println(value);
            }
        }
        System.out.print("**********************************************************************************");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        printEmployers();
        int chooseEmployeeDepartment = 2;
        int changeDepartment = 3;
        settingsDepartment(chooseEmployeeDepartment, changeDepartment);
        int chooseEmployeeSalary = 3;
        int changeSalary = 60000;
        settingsSalary(chooseEmployeeSalary, changeSalary);
        System.out.println("Сумма затрат на зарплаты составила " + calculateMonthAllSalary());
        System.out.print("**********************************************************************************");
        System.out.println(" ");
        System.out.println("Минимальная зарплата у сотрудника:" + calculateMinSalary());
        System.out.print("**********************************************************************************");
        System.out.println(" ");
        System.out.println("Максимальная зарплата у сотрудника:" + calculateMaxSalary());
        System.out.print("**********************************************************************************");
        System.out.println(" ");
        System.out.println("Среднее значение по ЗП: " + calculateAverageSalary());
        System.out.print("**********************************************************************************");
        System.out.println(" ");
        fullName();
        growSalary(5);
        int department = 2;
        System.out.println(minEmployeeDepartment(department));
        System.out.println(maxEmployeeDepartment(department));
        System.out.println(totalSalaryMonth(department));
        System.out.println(averageSalaryDepartment(department));
        System.out.print("**********************************************************************************");
        System.out.println(" ");
        double percent = 20;
        selectGrowSalary(percent);
        printNameAndSalary(department);
        int printSalary = 60000;
        salaryLow(printSalary);
        salaryHigh(printSalary);

    }


}



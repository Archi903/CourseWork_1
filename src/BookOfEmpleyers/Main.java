package BookOfEmpleyers;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        CourseWork1();
        CourseWork2();
    }
    public static void CourseWork1() {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee(" Иванов Иван Иванович", 1, 70000);
        employee[1] = new Employee(" Петров Илья Григорьевич", 3, 45000);
        employee[2] = new Employee(" Курчатов Василий Игоревич", 4, 61000);
        employee[3] = new Employee(" Киселева Марианна Михайловна", 5, 33000);
        employee[4] = new Employee(" Коновалова Злата Ивановна", 2, 76000);
        employee[5] = new Employee(" Лобанов Дмитрий Александрович", 4, 65000);
        employee[6] = new Employee(" Матвеев Роман Ильич", 3, 94000);
        employee[7] = new Employee(" Кочетов Давид Андреевич", 5, 55000);
        employee[8] = new Employee(" Кузнецов Фёдор Алексеевич", 1, 72000);
        employee[9] = new Employee(" Борисов Даниил Иванович", 2, 39000);


        employee[2].setDepartment(2);   // Поменять департамент
        employee[2].setSalary(47000);   // Поменять зарплату

        Arrays.stream(employee).forEach(System.out::println);

        System.out.print("**********************************************************************************");
        System.out.println("");

        double sumMonth = 0;
        for (Employee current : employee) {
            sumMonth = sumMonth + current.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты составила " + sumMonth);

        System.out.print("**********************************************************************************");
        System.out.println("");

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
        System.out.println("");

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
        System.out.println("");

        double averageMonth = sumMonth / employee.length;
        System.out.println(averageMonth);

        System.out.print("**********************************************************************************");
        System.out.println("");

        for (int i = 0; i < employee.length; i++) {
            String employeeName = employee[i].getName();
            System.out.println("ФИО: " + employeeName);
        }

        }
    public static void CourseWork2() {


        System.out.print("**********************************************************************************");
        System.out.println("");

        Employee[] employee = new Employee[10];
        employee[0] = new Employee(" Иванов Иван Иванович", 1, 70000);
        employee[1] = new Employee(" Петров Илья Григорьевич", 3, 45000);
        employee[2] = new Employee(" Курчатов Василий Игоревич", 4, 61000);
        employee[3] = new Employee(" Киселева Марианна Михайловна", 5, 33000);
        employee[4] = new Employee(" Коновалова Злата Ивановна", 2, 76000);
        employee[5] = new Employee(" Лобанов Дмитрий Александрович", 4, 65000);
        employee[6] = new Employee(" Матвеев Роман Ильич", 3, 94000);
        employee[7] = new Employee(" Кочетов Давид Андреевич", 5, 55000);
        employee[8] = new Employee(" Кузнецов Фёдор Алексеевич", 1, 72000);
        employee[9] = new Employee(" Борисов Даниил Иванович", 2, 39000);


        double setGrowSalary = 0.05;
        double growSalary;
        for (Employee value : employee) {
            growSalary = value.getSalary() + (value.getSalary() * setGrowSalary);
            value.setSalary(growSalary);
            System.out.println("Для сотрудника: " + value.getName() + ", зарплата прошла индексацию: " + value.getSalary());
        }


        System.out.print("**********************************************************************************");
        System.out.println("");

        String minEmployee = null;
        double minSum = 3000000;
        int setDepartment = 2;
        for (Employee value : employee) {
            if (minSum >= value.getSalary() && setDepartment == value.getDepartment()) {
                minEmployee = value.getName();
                minSum = value.getSalary();
                setDepartment = value.getDepartment();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника:" + minEmployee + ", департамент: " + setDepartment + ", зарплата: " + minSum + " рублей");

        System.out.print("**********************************************************************************");
        System.out.println("");

        String maxEmployee = null;
        double maxSum = 0;
        int setDepartmentMax = 4;
        for (Employee value : employee) {
            if (maxSum < value.getSalary() && setDepartmentMax == value.getDepartment()) {
                maxEmployee = value.getName();
                maxSum = value.getSalary();
                setDepartmentMax = value.getDepartment();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника:" + maxEmployee + ", департамент: " + setDepartmentMax + ", зарплата: " + maxSum + " рублей");

        System.out.print("**********************************************************************************");
        System.out.println("");
    }
}



package BookOfEmpleyers;

import java.util.Arrays;
import java.util.Objects;

public class Main {


        public static void main(String[] args) {


                Employee employee1 = new Employee(" Иванов Иван Иванович", 1, 20000);
                Employee employee2 = new Employee(" Петров Илья Григорьевич", 3, 45000);
                Employee employee3 = new Employee(" Петров Илья Григорьевич", 4, 61000);
                Employee employee4 = new Employee(" Киселева Марианна Михайловна", 5, 33000);
                Employee employee5 = new Employee(" Коновалова Злата Ивановна", 2, 76000);
                Employee employee6 = new Employee(" Лобанов Дмитрий Александрович", 4, 65000);
                Employee employee7 = new Employee(" Матвеев Роман Ильич", 3, 94000);
                Employee employee8 = new Employee(" Кочетов Давид Андреевич", 5, 55000);
                Employee employee9 = new Employee(" Кузнецов Фёдор Алексеевич", 1, 72000);
                Employee employee10 = new Employee(" Борисов Даниил Иванович", 2, 39000);

                Employee employees[] = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10};


                employee2.setDepartment(2);
                employee2.setSalary(47000);

                Arrays.stream(employees).forEach(System.out::println);
        }

                public static void spentMoney() {
                        int sum = 0;
                        for (Employee current : employees[0]) {
                                sum = sum + current.getSalary();
                        }
                        System.out.println("Сумма затрат на зарплаты составила " + sum);
                }

                public void maxSalary; {
                        int maxSum = employees[0].getSalary();
                        for (int i = 0; i <= employees.length; i++) {
                                if (maxSum >= employees[i].getSalary()) {
                                        String maxEmployee = employees[i].getName();
                                        maxSum = employees[i].getSalary();
                                        System.out.println(maxEmployee + "" + maxSum);
                                }

                        }
                        System.out.println(maxSum);
                }
        }
}


package pl.limescode.lesson5;

import java.math.BigDecimal;

public class Lesson5 {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan Bunin", "Writer", "ivan.bunin@gmail.com", "+79168675645", BigDecimal.valueOf(100000), 61);
        employees[1] = new Employee("Anton Chekhov", "Writer", "anton.chekhov@yahoo.com", "+79168475644", BigDecimal.valueOf(45000), 43);
        employees[2] = new Employee("Mikhail Lermontov", "Poet", "mikhail.lermontov@gmail.com", "+79168473344", BigDecimal.valueOf(27785), 22);
        employees[3] = new Employee("Alexander Pushkin", "Poet", "alexander.pushkin@yandex.ru", "+79166475641", BigDecimal.valueOf(50000), 32);
        employees[4] = new Employee("Boris Pasternak", "Poet", "boris.pasternak@gmail.com", "+79166485642", BigDecimal.valueOf(30000), 40);

        for (Employee employee : employees) {
            if (employee.getAge() > 40)
                employee.printEmployeeInfo();
        }
    }
}

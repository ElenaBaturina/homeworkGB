package test.HomeWork6;

import HomeWork5.Employee;

public class MainClass {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivanov", "ivanov@mail.ru", 45);
        employees[1] = new Employees("Ivanov1", "ivanov@mail.ru", 36);
        employees[2] = new Employees("Ivanov2", "ivanov@mail.ru", 52);
        employees[3] = new Employees("Ivanov3", "ivanov@mail.ru", 27);
        employees[4] = new Employees("Ivanov4", "ivanov@mail.ru", 48);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }
}
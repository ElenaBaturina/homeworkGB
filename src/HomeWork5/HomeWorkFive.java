package HomeWork5;

public class HomeWorkFive {

    public static void main(String[] args) {

//        System.out.println("*******");
//        Employee employee1 = new Employee("Иванова", "Елена", "Александровна", 30,
//                "Оператор", 3, "ivanova@yandex.ru", "+79186599274", " 20тыс.р.");


        System.out.println("*******");
        System.out.println("Все сотрудники: ");
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванова", "Елена", "Александровна", 30,
                "Оператор", 3, "Eivanova@yandex.ru", "+79186599123", " 20тыс.р.");
        employees[1] = new Employee("Иванова", "Татьяна", "Павловна", 50,
                "Инженер", 18, "Tivanova@yandex.ru", "+79186599234", " 35тыс.р.");
        employees[2] = new Employee("Иванова", "Юлия", "Александровна", 36,
                "Экономист", 7, "Yivanova@yandex.ru", "+79186599345", " 35тыс.р.");
        employees[3] = new Employee("Иванова", "Вероника", "Владимировна", 22,
                "Секретарь", 1, "Nivanova@yandex.ru", "+79186599456", " 15тыс.р.");
        employees[4] = new Employee("Иванов", "Александр", "Васильевич", 53,
                "Директор", 20, "Aivanova@yandex.ru", "+79186599567", " 50тыс.р.");


        System.out.println("*******");
        System.out.println("Сотрудники старше 40: ");
            for (int i = 0; i < employees.length; i++) {
            if (employees[i].seniorAge() > 40) {
            employees[i].printSenior();
            }
        }
    }

}
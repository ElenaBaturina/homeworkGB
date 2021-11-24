package HomeWork5;

public class Employee {

    private String surname;
    private String name;
    private String patronymic;
    private int age;
    private String post;
    private int workExperience;
    private String email;
   //private long phoneNum;
    private  String phoneNum;
    private String salary;


    public Employee(String surname, String name, String patronymic, int age, String post,
                    int workExperience, String email, String phoneNum, String salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.post = post;
        this.workExperience = workExperience;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;

        System.out.println("Сотрудник: " + surname + " " + name + " " + patronymic + ". Возраст: "
                + age + " лет. На должности: " + post + ", со стажем работы: " + workExperience +
                " г. Контактные данные: " + email + ", " + phoneNum + ". Зарплата: " + salary);
    }

    public void printSenior(){
        System.out.println("Сотрудник: " + surname + " " + name + " " + patronymic + ". Возраст: "
                + age + " лет. На должности: " + post + ", со стажем работы: " + workExperience +
                " г. Контактные данные: " + email + ", " + phoneNum + ". Зарплата: " + salary);
    }

    public int seniorAge(){
        return age;
    }



}

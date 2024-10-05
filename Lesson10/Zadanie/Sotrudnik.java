public class Sotrudnik {
     String name;
     String position;
     String email;
     String phoneNumber;
     double salary;
     int age;
    public Sotrudnik(String name, String position, String email,
                     String phoneNumber, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void voice(){
        System.out.println("ФИО: " + name + "; Должность: " + position + "; Почта: " + email +
                "; Номер телефона: " + phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}

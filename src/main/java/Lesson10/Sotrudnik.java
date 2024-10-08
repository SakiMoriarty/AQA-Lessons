package Lesson10;

import java.math.BigDecimal;

public class Sotrudnik {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phoneNumber;
    private BigDecimal salary;
    private int age;

    public Sotrudnik(String firstName, String lastName, String position, String email,
                     String phoneNumber, int salary, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = BigDecimal.valueOf(salary);
        this.age = age;
    }

    public void voice(){
        System.out.println("Имя: " + firstName + "; Фамилия: " + lastName + "; Должность: " + position + "; Почта: " + email +
                "; Номер телефона: " + phoneNumber + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}

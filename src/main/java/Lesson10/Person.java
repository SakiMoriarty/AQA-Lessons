package Lesson10;

import java.math.BigDecimal;

public class Person {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private String phone;
    private BigDecimal salary;
    private int age;

    public Person(String firstName, String lastName, String position, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = BigDecimal.valueOf(salary);
        this.age = age;
    }

    public void voice() {
        System.out.println("Имя: " + firstName + "; Фамилия: " + lastName + ", Должность: " + position + ", Email: " + email
                + ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
    }
}

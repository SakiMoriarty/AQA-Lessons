class Person {
    String name;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    public Person(String name, String position, String email, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void voice() {
        System.out.println("ФИО: " + name + ", Должность: " + position + ", Email: " + email
                + ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
    }
}

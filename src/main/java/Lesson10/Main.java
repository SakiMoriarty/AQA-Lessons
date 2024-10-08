package Lesson10;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("\nЗадание 1: ");

        Sotrudnik sotrudnik1 = new Sotrudnik("Михаил", "Зубенко", "Мафиозник", "profi@gmail.com",
                "+375299055548", 50150, 39);
        sotrudnik1.voice();

        //Задание 2
        System.out.println("\nЗадание 2: Создать массив из 5 сотрудников");

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иванов", "Иванов", "Инженер", "ivanov@mail.com", "+375213561982", 55500, 30);
        persArray[1] = new Person("Петров", "Петров", "Менеджер", "petrov@mail.com", "+375447832914", 39999, 28);
        persArray[2] = new Person("Алексей", "Сидоров", "Аналитик", "sidorovChai@mail.com", "+375253561982", 60000, 35);
        persArray[3] = new Person("Мария", "Кузнецова", "Маркетолог", "kuznetsovaGang@mail.com", "+375292910376", 48600, 25);
        persArray[4] = new Person("Анна", "Смирнова", "Программист", "smirnovaBigBoss@mail.com", "+375215678239", 70300, 27);

        for(Person person : persArray){
            person.voice();
        }

        //Задание 3
        System.out.println("\nЗадание 3: ");
        Park park = new Park("Парк развлечений");
        
        park.setAttraction1("Колесо обозрения", 8, 250.00);
        park.setAttraction2("Американские горки", 10, 500.00);
        park.setAttraction3("Комната страха", 5, 300.00);
        park.showAttractions();
    }
}
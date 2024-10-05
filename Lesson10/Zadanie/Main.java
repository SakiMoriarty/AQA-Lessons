public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("\nЗадание 1: ");

        Sotrudnik sotrudnik1 = new Sotrudnik("Зубенко Михаил Петрович", "Мафиозник", "profi@gmail.com",
                "+375299055548", 1248.12, 39);
        sotrudnik1.voice();

        //Задание 2
        System.out.println("\nЗадание 2: Создать массив из 5 сотрудников");

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иванов Иван", "Инженер", "ivanov@mail.com", "+375213561982", 50000, 30);
        persArray[1] = new Person("Петров Петр", "Менеджер", "petrov@mail.com", "+375447832914", 45000, 28);
        persArray[2] = new Person("Сидоров Алексей", "Аналитик", "sidorov@mail.com", "+375253561982", 60000, 35);
        persArray[3] = new Person("Кузнецова Мария", "Маркетолог", "kuznetsova@mail.com", "+375292910376", 48000, 25);
        persArray[4] = new Person("Смирнова Анна", "Программист", "smirnova@mail.com", "+375215678239", 70000, 27);

        for(Person person : persArray){
            person.voice();
        }

        //Задание 3
        System.out.println("\nЗадание 3: ");
        Park park = new Park("Колобок", 18.30, 200);
        park.showAttractions();
    }
}
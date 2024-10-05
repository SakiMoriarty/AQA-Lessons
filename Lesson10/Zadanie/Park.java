public class Park {
    private String Attractions;
    private double workTime;
    private double howMuch;
    public Park(String Attractions, double workTime, double howMuch){
        this.Attractions = Attractions;
        this.workTime = workTime;
        this.howMuch = howMuch;
    }

    public void voice() {
        System.out.println("Аттракцион: " + Attractions + ", Время работы: " + workTime + ", Стоимость: " + howMuch);
    }

    public void showAttractions() {
        Park attraction1 = new Park("Колесо обозрения", 8, 250);
        Park attraction2 = new Park("Американские горки", 10, 500);
        Park attraction3 = new Park("Комната страха", 5, 300);

        attraction1.voice();
        attraction2.voice();
        attraction3.voice();
    }
}

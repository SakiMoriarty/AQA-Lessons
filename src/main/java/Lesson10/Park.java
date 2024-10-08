package Lesson10;

public class Park {
    private String parkName;
    private Attraction attraction1;
    private Attraction attraction2;
    private Attraction attraction3;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public void setAttraction1(String name, double workTime, double price) {
        this.attraction1 = new Attraction(name, workTime, price);
    }

    public void setAttraction2(String name, double workTime, double price) {
        this.attraction2 = new Attraction(name, workTime, price);
    }

    public void setAttraction3(String name, double workTime, double price) {
        this.attraction3 = new Attraction(name, workTime, price);
    }

    public void showAttractions() {
        System.out.println("Аттракционы в парке " + parkName + ":");
        if (attraction1 != null) attraction1.voice();
        if (attraction2 != null) attraction2.voice();
        if (attraction3 != null) attraction3.voice();
    }
}

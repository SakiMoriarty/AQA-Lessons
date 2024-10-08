package Lesson10;

public class Animal {
    protected String name;
    protected int maxDistance;
    protected int minDistance;

    public Animal(String name, int maxDistance, int minDistance){
        this.name = name;
        this.maxDistance = maxDistance;
        this.minDistance = minDistance;
    }

    public void run(int distance){
        if(distance <= maxDistance){
            System.out.println(name + " пробежал: " + distance + "м.");
        }
        else{
            System.out.println(name + " не мог пробежать больше: " + maxDistance + "м.");
        }
    }

    public void swim(int distance){
        if(distance <= maxDistance){
            System.out.println(name + " проплыл : " + distance + "м.");
        }
        else if (distance > maxDistance){
            System.out.println(name + "не мог проплыть больше: " + maxDistance);
        }
        else{
            System.out.println(name + " плавать не умеет, он же кот!");
        }
    }
}

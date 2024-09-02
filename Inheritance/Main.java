package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        BoxWeight box2 = new BoxWeight();
        System.out.println(box2.l + " " + box2.b + " " + box2.h + " " + box2.weight);
        box2.information();
        System.out.println("b: " + box.b + " l: " + box.l + " h: " + box.h);
        box.information();
    }

}

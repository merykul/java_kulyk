package lesson7;

public class Main {
    public static void main(String[] args) {

        Triangle t = new Triangle(8);
        t.setSide1(12);
        t.setSide2(23);
        t.setSide3(15);
        System.out.println(t.dataAboutShape());

        Circle c = new Circle(15);
        System.out.println(c.dataAboutShape());

        Rectangle r = new Rectangle(12,16);
        r.setHigh(16);
        r.setWidth(12);
        System.out.println(r.dataAboutShape());

        Lion l = new Lion();
        l.setName("Honey");
        System.out.println(l.eat());

        Horse h = new Horse();
        h.setName("Bae");
        h.setAge(4);
        System.out.println(h.sleep());
    }
}

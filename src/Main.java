import lesson6tasks.Circle;
import lesson6tasks.Dog;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle(12,23);
        Circle circleFirst = new Circle(12,3.14);
        Dog dogFirst = new Dog("Retriever",2,"Doggy");

        System.out.println(rectangleFirst.Area(12,23));
        System.out.println(rectangleFirst.Perimeter(12,23));

        System.out.println(circleFirst.CircleArea(12,3.14));
        System.out.println(circleFirst.CirclePerimeter(12,3.14));

        System.out.println(dogFirst.Sit("Retriever", 2,"Doggy"));
        System.out.println(dogFirst.Eat("Retriever", 2,"Doggy"));
    }
}
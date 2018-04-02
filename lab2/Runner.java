package labs_java.lab2;

public class Runner {
    public static void main(String[] args) {
        Figure figures[] = {
                new Figure(5, 10),
                new Triangle(5, 7, 4, "rect"),
                new Circle(35),
                new Rectangle(24,33),
                new Circle(23, 44,22),
                new Rectangle(44,22,22,26),
                new Triangle(33,22,11, "none"),
                new Circle(22),
                new Triangle(23,23,23, "iso")
        };

        for (Figure figure : figures){
            System.out.println(figure);
        }
    }
}

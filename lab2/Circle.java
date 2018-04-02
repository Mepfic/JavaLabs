package labs_java.lab2;

public class Circle extends Figure{
    private double radius;
    private final double PI = 3.14;

    public Circle (){

    }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (double posX, double posY, double radius){
        super(posX, posY);
        this.radius = radius;
    }

    @Override
    protected String getSquare(){
        return "Square is: "+ (PI*radius*radius);
    }

    @Override
    public String toString(){
        return "radius " + radius + ";" + super.toString() + ";";
    }

}

package labs_java.lab2;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;
    private String type;

    public Triangle(){

    }

    public Triangle (int side1, int side2, int side3, String type){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.type = type;
    }

    public Triangle(double posX, double posY, int side1, int side2, int side3, String type){
        super(posX, posY);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.type = type;
    }

    @Override
    protected String getSquare(){
        double p = (side1+side2+side3)/2;
        double S = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return "Square is: " + S;
    }

    @Override
    public String toString(){
        return "side1 " + side1 + ";" + "side2 " + side2 + ";" + "side3 " + side3 + ";" + super.toString() + ";";
    }
}

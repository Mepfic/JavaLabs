package labs_java.lab2;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(){

    }

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double posX, double posY, int width, int height){
        super(posX, posY);
        this.width = width;
        this.height = height;
    }

    @Override
    protected String getSquare(){
        return "Square is:" + (width*height);
    }

    @Override
    public String toString(){
        return "width " + width + ";" + "height " + height + ";" + super.toString() + ";";
    }


}

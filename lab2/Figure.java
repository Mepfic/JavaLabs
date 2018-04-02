package labs_java.lab2;

public class Figure {
    private double posX;
    private double posY;


    public Figure() {
        this.posX = 0.0;
        this.posY = 0.0;
    }

    public Figure(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }



    protected String getSquare(){
        return posX+";"+posY;
    }

    @Override
    public String toString() {
        return getSquare()+";";
    }
}

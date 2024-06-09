package miniprojekt.tools;

public class CirclePosition {

    private int size;

    public CirclePosition(int size){
        this.size = size;
    }

    public Coordinate calcPosition(int radius, int angle, Coordinate start){
        //Formel für Kreis (x-start.getX())^2+(y-start.getY())^2 = radius
        return new Coordinate(0,0);
    }

}

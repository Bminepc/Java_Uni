package miniprojekt.tools;

public class Vector {

    private Coordinate start;
    private Coordinate end;

    public Vector(Coordinate start, Coordinate end) {
        this.start = start;
        this.end = end;
    }

    public void setStart(Coordinate start) {
        this.start = start;
    }

    public void setEnd(Coordinate end) {
        this.end = end;
    }

    public Coordinate getStart() {
        return start;
    }

    public Coordinate getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "(" + start.toString() + "," + end.toString() + ")";
    }
}

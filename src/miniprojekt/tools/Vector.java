package miniprojekt.tools;

public class Vector {

    public Coordinate start;
    public Coordinate end;

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
}

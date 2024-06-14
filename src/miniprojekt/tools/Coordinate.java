package miniprojekt.tools;

/**
 * Klasse für das abspeichern von Koordinaten
 *
 * @author Benjamin Wendt
 * @version 1.0
 */
public class Coordinate {

    private int x;
    private int y;

    /**
     * Konstruktor für die Koordinate
     *
     * @param x X-Koordinate
     * @param y Y-Koordinate
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get X-Koordinate
     *
     * @return X-Koordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Get Y-Koordinate
     *
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * Set X-Koordinate
     *
     * @param x X-Koordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Set Y-Koordinate
     *
     * @param y Y-Koordinate
     */
    public void setY(int y) {
        this.y = y;
    }
    public Boolean equals(Coordinate t){
        if(t.getX() == this.getX() && t.getY() == this.getY()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

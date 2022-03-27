package ca.bcit.comp2522.termproject.spiritbear;

/**
 * Actor is an abstract class inteded to be used as a superclass.
 * @author Davidlee
 * @version 2022
 */
public abstract class Actors {
    /**
     * Stores the actor's name as a string.
     */
    protected final String name;
    /**
     * Stores the actor's X coordinate.
     */
    int xCoordinate;
    /**
     * Stores the actor's Y coordinate.
     */
    int yCoordinate;

    /**
     * Constructs an object of type Actor
     * @param name a String.
     * @param xCoordinate an int.
     * @param yCoordinate an integer.
     */
    public Actors(String name, int xCoordinate, int yCoordinate) {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns the name for this actor.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     *Returns the X-coordinate for this actor.
     *
     * @return xCoordinate
     */
    public int getxCoordinate() {
        return xCoordinate;
    }

    /**
     * Returns the Y-Coordinate for this actor.
     *
     * @return yCoordinate.
     */
    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * Returns a String representation of this actor.
     *
     * @return description.
     *
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Actors{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

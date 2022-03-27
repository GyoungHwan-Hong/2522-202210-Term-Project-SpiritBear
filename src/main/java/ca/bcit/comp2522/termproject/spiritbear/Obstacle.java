package ca.bcit.comp2522.termproject.spiritbear;

abstract class Obstacle {
    /**
     * Stores the Obstacle's X coordinate.
     */
    int xCoordinate;
    /**
     * Stores the Obstacle's Y coordinate.
     */
    int yCoordinate;
    /**
     * Stores the Obstacle's height.
     */
    int height;
    /**
     * Stores the Obstacle's width.
     */
    int width;

    public Obstacle(int xCoordinate, int yCoordinate, int height, int width) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.height = height;
        this.width = width;
    }
}

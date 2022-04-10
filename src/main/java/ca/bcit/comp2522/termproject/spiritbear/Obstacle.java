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

    int id;

    public Obstacle(int xCoordinate, int yCoordinate, int height, int width, int id) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.height = height;
        this.width = width;
        this.id = id;
    }

    public void initPosition(int[][] arr) {

        int si = xCoordinate - height / 2;
        int fi = xCoordinate + height / 2;
        int sj = yCoordinate - width / 2;
        int fj = yCoordinate + width / 2;

        for ( int i = si; i <= fi; i++) {
            for (int j = sj; j <= fj ; j++) {
                arr[i][j] = id;
            }
        }
    }
}

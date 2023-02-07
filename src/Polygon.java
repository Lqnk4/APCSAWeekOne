/**
 * @file Polygon.java
 *@author Aaryan Ilanchelian
 *@date 2023/02/02
*/

public class Polygon {
    private int numSides;
    private double sideLength;
    private String shapeType;

    /**
     * Constructor for polygon with n sides
     *
     * @param numSides Number of Sides
     * @param sideLength SideLengths of each side
     */
    public Polygon(int numSides, double sideLength, String shapeType) {
        this.numSides = numSides;
        this.sideLength = sideLength;
        this.shapeType = shapeType;
    }

    /**
     * Default Constructor
     */
    public Polygon() {
        this(3, 1, "triangle");
    }

    /**
     * Gets the number of Sides
     * @return numSides
     */
    public int getNumSides() {
        return numSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    /**
     * Gets a String of the Polygon Shape name
     * @return ShapeType
     */
    public String getShapeType() {
        return shapeType;
    }

    /**
     * Sets number of sides
     * @param numSides input
     */
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    /**
     * Sets sideLength
     * @param sideLength length of Sides
     */
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    /**
     * Sets shapeType
     * @param shapeType string to set shape to
     */
    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    /**
     * Checks if the polygon exists by comparing sums of n-1 sides with last side
     * Does not guarantee a non-self-intersecting polygon
     * @return boolean whether the polygon could exist
     */
    public boolean isValid() {
        return numSides >= 3;
    }

    /**
     * Calculates the Perimeter of the shape
     * @return perimeter
     */
    public double calculatePerimeter() {
        return numSides * sideLength;
    }

    /**
     * String representation of polygon object
     * @return String containing relevant info
     */
    @Override
    public String toString() {
        return "Your shape is a " + shapeType + " and it has " + numSides + " sides. \n" +
                "It has a side length of " + sideLength + "\n" +
                "It has a perimeter of " + String.format("%.3f", calculatePerimeter()) + " units. \n" +
                (isValid() ? "This is a valid Polygon." : "This is not a valid Polygon." + "\n");
    }

    /**
     * Calculates area of the shape of a regular polygon object
     * @return Polygon Object Area
     */
    public double calculateArea() {
        return numSides * sideLength * sideLength /(4 * Math.tan(Math.PI / numSides));
    }
}

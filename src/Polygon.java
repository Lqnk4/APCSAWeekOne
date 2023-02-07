/**
 * {@code @file} Polygon.java
 *@author Aaryan Ilanchelian
 *{@code @date} 2023/06/02
 */

public record Polygon(int numSides, double sideLength, String shapeType) {

    /**
     * First Constructor
     * @param numSides number of sides of the polygon
     * @param sideLength the side length of all sides of the polygon
     * @param shapeType the shape name of the polygon
     */
    public Polygon(int numSides, double sideLength, String shapeType) {
        boolean valid = numSides >= 3 || sideLength > 0;
        this.numSides = valid ? numSides : 3;
        this.sideLength = valid ? sideLength : 1;
        this.shapeType = valid ? shapeType : "triangle";

    }

    /**
     * Default Constructor
     */
    public Polygon() {
        this(3,1,"triangle");
    }

    /**
     * Gets a String of the Polygon Shape name
     * @return ShapeType
     */
    public String getShapeType() {
        return shapeType;
    }

    /**
     * Checks if the shape is still valid after mutations
     * @return boolean whether the polygon has a minimum amount of sides and side length
     */
    public boolean isValid() {
        return numSides >= 3 && sideLength > 0;
    }

    /**
     * Calculates the Perimeter of the shape
     * @return perimeter
     */
    public double calculatePerimeter() {
        return numSides * sideLength;
    }

    /**
     * Calculates area of the shape of a regular polygon object
     * @return Polygon Object Area
     */
    public double calculateArea() {
        return numSides * sideLength * sideLength /(4 * Math.tan(Math.PI / numSides));
    }

    /**
     * String representation of polygon object
     * @return String containing relevant info
     */
    @Override
    public String toString() {
        return "Your shape is a %s and it has %d sides. \nIt has a side length of %s\nIt has a perimeter of %s units. \nThis is %s a valid Polygon\n".formatted(shapeType, numSides, sideLength, String.format("%.3f", calculatePerimeter()), isValid() ? "" : "not");
    }
}

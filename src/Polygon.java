/**
 * {@code @file} Polygon.java
 *@author Aaryan Ilanchelian
 *{@code @date} 2023/06/02
 */

public record Polygon(int numSides, double sideLength, String shapeType) {

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
        return "Your shape is a " + shapeType + " and it has " + numSides + " sides. \n" +
                "It has a side length of " + sideLength + "\n" +
                "It has a perimeter of " + String.format("%.3f", calculatePerimeter()) + " units. \n" +
                (isValid() ? "This is a valid Polygon." : "This is not a valid Polygon.") + "\n";
    }
}

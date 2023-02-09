import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * {@code @file} Polygon.java
 *@author Aaryan Ilanchelian
 *{@code @date} 2023/06/02
 */

public class Polygon {

    private int numSides;
    private double sideLength;
    private String shapeType;
    private double area;

    /**
     * First Constructor
     * @param numSides number of sides of the polygon
     * @param sideLength the side length of all sides of the polygon
     * @param shapeType the shape name of the polygon
     */
    public Polygon(int numSides, double sideLength, String shapeType) {
        boolean valid = numSides >= 3 && sideLength > 0;
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
     * Gets an int of the Polygon number of sides
     * @return numSides
     */
    public int getNumSides() {
        if(!isValid()) {numSides = 3;}
        return numSides;
    }

    /**
     * Gets a double of the side-length
     * @return side length of polygon
     */
    public double getSideLength() {
        if(!isValid()) {sideLength = 1;}
        return sideLength;
    }

    /**
     * Gets a String of the Polygon Shape name
     * @return ShapeType
     */
    public String getShapeType() {
        return shapeType;
    }
    
    public void setShapeName(String shapeType) {
        this.shapeType = shapeType;
    }
    public void setNumSides(int shapeType) {
        if(shapeType < 3) {return;}
        this.numSides = shapeType;
    }
    public void setSideLength(double sideLength) {
        if(sideLength <= 0) {return;}
        this.sideLength = sideLength;
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
        return round(getNumSides() * getSideLength(), 3);
    }

    /**
     * Calculates area of the shape of a regular polygon object
     * @return Polygon Object Area
     */
    public double calculateArea() {
        return round(getNumSides() * getSideLength() * sideLength /(4 * Math.tan(Math.PI / numSides)), 3);
    }
    public double getArea() {
        return calculateArea();
    }

    /**
     * String representation of polygon object
     * @return String containing relevant info
     */
    @Override
    public String toString() {
        return "Your shape is a %s and it has %d sides. \nIt has a side length of %s\nIt has a perimeter of %s units. \nThis is %s a valid Polygon\n".formatted(shapeType, getNumSides(), getSideLength(), String.format("%.3f", calculatePerimeter()), isValid() ? "" : "not");
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        return new BigDecimal(Double.toString(value)).setScale(places, RoundingMode.HALF_UP).doubleValue();

    }
}

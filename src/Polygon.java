import java.util.Arrays;
import java.util.HashMap;

public class Polygon {
    private final int numSides;
    private final boolean regular;
    final double[] sideLengths;
    private static final HashMap<Integer, String> map = new HashMap<>();
    static {
        map.put(1, "Point");
        map.put(2, "Line");
        map.put(3, "Triangle");
        map.put(4, "Square");
        map.put(5, "Pentagon");
        map.put(6, "Hexagon");
        map.put(7, "Heptagon");

    }

    /**
     * Constructor for polygon with n sides
     *
     * @param numSides Number of Sides
     * @param sideLengths SideLengths of each side
     */
    public Polygon(int numSides, double... sideLengths) {
        boolean regular1;
        this.numSides = numSides;
        if(sideLengths.length == numSides || !(Arrays.stream(sideLengths).distinct().count() == 1)) {
            regular1 = true;
            this.sideLengths = sideLengths;
        } else {
            this.sideLengths = new double[1];
            this.sideLengths[0] = sideLengths[0];

            regular1 = false;
        }

        if(numSides < 3 ) regular1 = false;

        this.regular = regular1;
    }

    /**
     * Default Constructor
     */
    Polygon() {
        this(3, 1);
    }

    /**
     * Gets the number of Sides
     * @return numSides
     */
    public int getNumSides() {
        return numSides;
    }

    public double[] getSideLengths() {
        return sideLengths;
    }

    /**
     * Gets a String of the Polygon Shape name
     * @return ShapeType
     */
    public String getShapeType() {
        return map.get(numSides);
    }

    /**
     * Gets weather the shape is regular
     * @return isRegular
     */
    public boolean isRegular() {
         return regular;
    }

    /**
     * Checks if the polygon exists by comparing sums of n-1 sides with last side
     * Does not guarantee a non-self-intersecting polygon
     * @return boolean whether the polygon could exist
     */
    public boolean isValid() {
        for(double d : sideLengths) {
            double sum = -d;
            for(double e: sideLengths) {
                sum += e;
            }
            if(sum < d) return false;
        }
        return true;
    }

    /**
     * Calculates the Perimeter of the shape
     * @return perimeter
     */
    public double calculatePerimeter() {
        if(sideLengths.length > 1) {
            double sum = 0;
            for(double d : sideLengths) {
                sum += d;
            }
            return sum;
        }

        return numSides * sideLengths[0];
    }

    /**
     * toString Implementation
     * @return Object Parameters in String form
     */
    public String toString() {
        return "Your shape is a " + getShapeType() + " and it has " + numSides + " sides. \n" +
                (sideLengths.length > 1  ? "It's side lengths are " + printArray(sideLengths) : "It has a side length of " + sideLengths[0]) + "\n" +
                "It has a perimeter of " + calculatePerimeter() + " units. \n" +
                (isValid() ? "This is a valid Polygon." : "This is not a valid Polygon." + "\n");
    }

    /**
     * Calculates area of the shape of a regular polygon object
     * @return Polygon Object Area
     */
    public double calculateArea() {
        if(!regular) {
            return -1;
        }
        return numSides * sideLengths[0] * sideLengths[0] /(4 * Math.tan(Math.PI / numSides));
    }

    /**
     * Used to print the array of side Lengths for the toString method
     * @param array to be printed
     * @return Concatenated String of all objects in array
     */
    private String printArray(double[] array) {
        StringBuilder result = new StringBuilder();
        for(Object i : array) {
            result.append(i).append(", ");
        }
        return result.toString();
    }


}
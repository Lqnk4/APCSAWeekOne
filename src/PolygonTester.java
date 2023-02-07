/**
 * {@code @file} Polygon.java
 *@author Aaryan Ilanchelian
 *{@code @date} 2023/02/02
 */

public class PolygonTester {
    public static void main(String[] args) {
        Polygon poly = new Polygon();
        System.out.println(poly);
        assert poly.calculatePerimeter() == 3.0;
        assert String.format("%.2f", poly.calculateArea()).equals("0.43");
        assert poly.isValid();
        assert poly.getShapeType().equals("triangle");
    }
}

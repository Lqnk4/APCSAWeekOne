public class PolygonTester {
    public static void main(String[] args) {
        /*System.out.println("\nThis is the output with 5 sides, side length of 6.865, and a name of pentagon");
        Polygon poly1 = new Polygon(5,6.865,"pentagon");
        System.out.println(poly1);

        System.out.println("\nThis is the output using the default constructor.");
        Polygon poly2 = new Polygon();
        System.out.println(poly2);

        System.out.println("\nThis is an example output for an invalid polygon.");
        Polygon poly3 = new Polygon(1,785,"line");
        System.out.println(poly3);*/

        System.out.println("\nThis is the output with 5 sides, side length of 6.865, and a name of pentagon");
        Polygon poly1 = new Polygon(5, 6.865, "Pentagon");
        System.out.println(poly1.getNumSides() == 5);
        System.out.println(poly1.getSideLength() == 6.865);
        System.out.println(poly1.getShapeType().equals("Pentagon"));
        System.out.println(poly1.calculateArea() == 81.083);
        System.out.println(poly1.calculateArea());

        System.out.println(poly1.calculatePerimeter() == 34.325);

        System.out.println("\nThis is the output using the default constructor.");
        Polygon poly2 = new Polygon();
        System.out.println(poly2.getNumSides() == 3);
        System.out.println(poly2.getSideLength() == 1.0);
        System.out.println(poly2.getShapeType().equals("Triangle"));
        System.out.println(poly2.calculateArea() == 0.433);
        System.out.println(poly2.calculatePerimeter() == 3.0);

        System.out.println("\nThis is an example output for an invalid polygon.");
        Polygon poly3 = new Polygon(1, 785, "line");
        System.out.println(poly3.getNumSides() == 3);
        System.out.println(poly3.getSideLength() == 1.0);
        System.out.println(poly3.calculateArea() == 0.433);
        System.out.println(poly3.calculatePerimeter() == 3.0);
        System.out.println(poly3.getShapeType().equals("Triangle"));
        System.out.println(poly3);

        System.out.println("\n I have now changed the invalid polygon to a 4 sided shape with a length of 2.4738 named Square");
        poly3.setNumSides(4);
        poly3.setSideLength(2.4738);
        poly3.setShapeName("Square");
        System.out.println(poly3.getShapeType().equals("Square"));
        System.out.println(poly3.getNumSides() == 4);
        System.out.println(poly3.getSideLength() == 2.4738);
        System.out.println(poly3.calculatePerimeter() == 9.895);
        System.out.println(poly3.getArea() == 6.120);

        System.out.println("\n I'm now changing the shape to be invalid with a side length of -3. Nothing else should change");
        poly3.setSideLength(-3.0);
        System.out.println(poly3.getShapeType().equals("Square"));
        System.out.println(poly3.getNumSides() == 4);
        System.out.println(poly3.getSideLength() == 2.4738);
        System.out.println(poly3.calculatePerimeter() == 9.895);
        System.out.println(poly3.calculateArea() == 6.120);

        System.out.println("\n I'm now changing the shape to be invalid with -12 sides. Nothing else should change");
        poly3.setNumSides(-12);
        System.out.println(poly3.getShapeType().equals("Square"));
        System.out.println(poly3.getNumSides() == 4);
        System.out.println(poly3.getSideLength() == 2.4738);
        System.out.println(poly3.calculatePerimeter() == 9.895);
        System.out.println(poly3.calculateArea() == 6.120);
    }
}

public class PolygonTester {
    public static void main(String[] args) {
        Polygon poly = new Polygon(5, 1);
        System.out.println(poly);
        assert poly.calculatePerimeter() == 5.0;
        assert String.format("%.4f", poly.calculateArea()).equals("1.7205");
        assert poly.getSideLengths().length == 1;
        assert poly.isValid();
        assert poly.getShapeType().equals("Pentagon");
    }
}

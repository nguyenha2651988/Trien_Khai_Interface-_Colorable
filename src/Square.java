public class Square implements Colorable {
    private double radius;

    public Square() {
    }

    public Square(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    public void area(double radius) {
      double area = this.radius * 2;
    }
}

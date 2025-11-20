public abstract class Parallelogram implements Figure {
    private double a;
    private double b;

    public Parallelogram(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
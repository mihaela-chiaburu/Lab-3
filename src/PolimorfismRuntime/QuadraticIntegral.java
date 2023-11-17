package PolimorfismRuntime;

public class QuadraticIntegral extends Integral {
    private double a;
    private double b;
    private double c;
    public QuadraticIntegral(double limitSup, double limitInf, double a, double b, double c) {
        super(limitSup, limitInf);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calculateIntegral() {
        // Integral (ax^2 + bx + c) = (a/3)x^3 + (b/2)x^2 + cx + C
        return ((a / 3) * Math.pow(super.getLimitInf(), 3) + (b / 2) * Math.pow(super.getLimitInf(), 2) + c * super.getLimitInf()) -
                ((a / 3) * Math.pow(super.getLimitSup(), 3) + (b / 2) * Math.pow(super.getLimitSup(), 2) + c * super.getLimitSup());
    }

    @Override
    public String showResult() {
        return "Quadratic Integral Result: " + calculateIntegral();
    }
}

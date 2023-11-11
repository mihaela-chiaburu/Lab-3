package PolimorfismRuntime;

public class LinearIntegral extends Integral {
    private double a;
    private double b;
    LinearIntegral(double limitSup, double limitInf, double a, double b) {
        super(limitSup, limitInf);
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateIntegral() {
        //Integral (ax + b) = (a/2)x^2 + bx + C
        return ((a / 2) * Math.pow(super.getLimitInf(), 2) + b * super.getLimitInf()) - ((a / 2) * Math.pow(super.getLimitSup(), 2) + b * super.getLimitSup());
    }
    @Override
    public String showResult() {
        return "Linear Integral Result: " + calculateIntegral();
    }
}

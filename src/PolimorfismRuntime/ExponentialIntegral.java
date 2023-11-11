package PolimorfismRuntime;

public class ExponentialIntegral extends Integral {
    private double a;
    private double b;
    ExponentialIntegral(double limitSup, double limitInf, double a, double b) {
        super(limitSup, limitInf);
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateIntegral() {
        // Integral (ae^(bx)) = (a/b)e^(bx) + C
        return (a / b) * Math.exp(b * super.getLimitInf()) - ((a / b) * Math.exp(b * super.getLimitSup()));
    }

    @Override
    public String showResult() {
        return "Exponential Integral Result: " + calculateIntegral();
    }
}

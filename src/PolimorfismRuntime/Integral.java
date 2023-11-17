package PolimorfismRuntime;

public class Integral {
    private double limitSup;
    private double limitInf;

    public Integral(double limitSup, double limitInf) {
        this.limitSup = limitSup;
        this.limitInf = limitInf;
    }

    public double getLimitSup() {
        return limitSup;
    }

    public void setLimitSup(double limitSup) {
        this.limitSup = limitSup;
    }

    public double getLimitInf() {
        return limitInf;
    }

    public void setLimitInf(double limitInf) {
        this.limitInf = limitInf;
    }

    public double calculateIntegral() {
        return 0.0;
    }

    public String showResult() {
        return "Integral result: " + calculateIntegral();
    }

}

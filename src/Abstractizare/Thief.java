package Abstractizare;
public class Thief implements GameCharacter {
    private double speed;

    public Thief(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void attack() {
        System.out.println("Thief attacks with a dagger!");
    }

    @Override
    public void defend() {
        System.out.println("Thief dodges to avoid attacks!");
    }

    @Override
    public void move() {
        System.out.println("Thief moves fast. Current Speed: " + getSpeed());
    }

    public void increaseSpeed(double amount) {
        System.out.println("Increasing Thief's speed by " + amount);
        setSpeed(getSpeed() + amount);
    }

    @Override
    public String showInfo() {
        return "===== Thief =====\n" +
                "Speed: " + getSpeed() + "\n";
    }
}
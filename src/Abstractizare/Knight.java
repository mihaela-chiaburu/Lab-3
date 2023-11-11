package Abstractizare;

public class Knight implements GameCharacter{
    private double damage;
    private double defaultDefense;

    public Knight(double damage, double defaultDefense) {
        this.damage = damage;
        this.defaultDefense = defaultDefense;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDefaultDefense() {
        return defaultDefense;
    }

    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword! Current Attack Power" + getDamage() );
    }

    @Override
    public void defend() {
        System.out.println("Knight raises a shield to defend! Current Defense stats " + getDefaultDefense());
    }

    @Override
    public void move() {
        System.out.println("Knight moves slow with heavy armor.");
    }

    public void increaseDamage(double amount) {
        System.out.println("Increasing Knight's damage by " + amount);
        setDamage(getDamage() + amount);
    }
    @Override
    public String showInfo() {
        return "===== Knight =====\n" +
                "Attack: " + getDamage() + "\n" +
                "Defense: " + getDefaultDefense() + "\n";
    }
}

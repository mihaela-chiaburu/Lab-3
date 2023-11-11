package PolimorfismCompilare;

public class CreatureEncyclopedia {
    private String creatureName;
    private String classCreature;
    private int level;
    private String ability;
    private double health;

    public CreatureEncyclopedia(){
    }
    public CreatureEncyclopedia(String classCreature, String creatureName){
        this.classCreature = classCreature;
        this.creatureName = creatureName;
    }
    public CreatureEncyclopedia(String classCreature, String creatureName, int level){
        this.classCreature = classCreature;
        this.creatureName = creatureName;
        this.level = level;
    }
    public CreatureEncyclopedia(String classCreature, String creatureName, double health){
        this.classCreature = classCreature;
        this.creatureName = creatureName;
        this.health = health;
    }
    public CreatureEncyclopedia(String classCreature, String creatureName, String ability){
        this.classCreature = classCreature;
        this.creatureName = creatureName;
        this.ability = ability;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public int getLevel() {
        return level;
    }

    public String getClassCreature() {
        return classCreature;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void fightCreature(int damage) {
        if (health > 0) {
            System.out.println(creatureName + " is attacking!");
            health -= damage;
            if (health < 0) {
                health = 0;
            }
            System.out.println(creatureName + " received " + damage + " damage. Current health: " + health);
        } else {
            System.out.println(creatureName + " is already defeated. No need to fight.");
        }
    }

    @Override
    public String toString() {
        return "Creature: \n" +
                "creatureName = " + getCreatureName() + '\n' +
                "level = " + getLevel() + '\n' +
                "ability = " + getAbility() + '\n' +
                "health = " + getHealth() + '\n';
    }
}

package Abstractizare;

public class Main {
    public static void main(String[] args){
        GameCharacter knight = new Knight(545, 1000);
        GameCharacter thief = new Thief(50);
        GameCharacter cleric = new Cleric(1500);

        System.out.println("Initial Info for Knight, Thief and Cleric:");
        System.out.println(knight.showInfo());
        System.out.println(thief.showInfo());
        System.out.println(cleric.showInfo());

        /*((Knight) knight).increaseDamage(100);
        thief.increaseSpeed(20);
        cleric.increaseHealingPower(200);

        System.out.println("\nUpdated Info");
        System.out.println(knight.showInfo());
        System.out.println(thief.showInfo());
        System.out.println(cleric.showInfo());*/

    }
}

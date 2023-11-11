package PolimorfismCompilare;

public class Main {
    public static void main(String[] args){
        CreatureEncyclopedia dragon = new CreatureEncyclopedia();
        CreatureEncyclopedia elf = new CreatureEncyclopedia("Elf","Thranduil");
        CreatureEncyclopedia kitsune = new CreatureEncyclopedia("Kitsune","Yuki", 15);
        CreatureEncyclopedia chimera = new CreatureEncyclopedia("Chimera","Manticora", 1500000d);
        CreatureEncyclopedia nymph = new CreatureEncyclopedia("Nymph", "Daphne", "Healing Powers");

        System.out.println(dragon);
        System.out.println(elf);
        System.out.println(kitsune);
        System.out.println(chimera);
        System.out.println(nymph);

        chimera.fightCreature(15000);
        //kopim ultu + baffs
        chimera.fightCreature(18000);
        //opacikiiii ultttaaaa
        chimera.fightCreature(1300000);
    }
}

package PolimorfismCompilare;

import java.util.List;
public class Main {
    public static void main(String[] args){
        CreatureEncyclopedia dragon = new CreatureEncyclopedia();
        CreatureEncyclopedia elf = new CreatureEncyclopedia("Elf","Thranduil");
        CreatureEncyclopedia kitsune = new CreatureEncyclopedia("Kitsune","Yuki", 15);
        CreatureEncyclopedia chimera = new CreatureEncyclopedia("Chimera","Manticora", 1500000d);

        List<CreatureEncyclopedia> list = List.of(dragon, elf, kitsune, chimera);

        for(CreatureEncyclopedia creature: list){
            System.out.println(creature);
        }
        System.out.println();

        chimera.fightCreature(15000);
        //kopim ultu + baffs
        chimera.fightCreature(15000d, 3000);
        //opacikiiii ultttaaaa
        chimera.fightCreature(15000d, 1285000);
    }
}

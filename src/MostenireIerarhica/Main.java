package MostenireIerarhica;

public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Sun", 1.989e30, 695508.0, 150e6,
                false, 5778d, "Yellow-white");
        Planet earth = new Planet("Earth", 5.972e24, 6371.0, 0.0,
                true, false, 1);
        DwarfPlanet pluto = new DwarfPlanet("Pluto", 1.303e22, 1188.3, 2.074e14,
                false, false, 5, true);
        Pulsar crabPulsar = new Pulsar("Crab Pulsar", 2.0, 10.0, 7175d,
                false, 1550000d, "Pulsar", 0.033);
        Moon moon = new Moon("Luna", 7.342e22, 1737.1, 384400.0,
                false, "Earth", true);

        System.out.println(sun);
        System.out.println(earth);
        System.out.println(pluto);
        System.out.println(crabPulsar);
        System.out.println(moon);

        //after August 2006 :((
        pluto.setRecognizedAsPlanet(false);
        System.out.println(pluto.getName()+ " is a planet? " + pluto.getRecognizedAsPlanet() + " ((( no more xd xd");
    }
}
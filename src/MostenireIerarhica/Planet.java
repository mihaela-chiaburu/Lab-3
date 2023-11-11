package MostenireIerarhica;

public class Planet extends CelestialBody{
    private Boolean hasRings;
    private int numberOfMoons;

    public Planet(String name, Double mass, Double radius, Double distanceFromUs, Boolean hasAtmosphere, Boolean hasRings, int numberOfMoons) {
        super(name, mass, radius, distanceFromUs, hasAtmosphere);
        this.hasRings = hasRings;
        this.numberOfMoons = numberOfMoons;
    }

    public Boolean getHasRings() {
        return hasRings;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }
    @Override
    public String toString() {
        return "Star:" +
                "Name = " + super.getName() + '\n' +
                "Mass = " + super.getMass() + '\n' +
                "Radius = " + super.getRadius() + '\n' +
                "Distance from us = " + super.getDistanceFromUs() + '\n' +
                "Has atmosphere = " + super.getHasAtmosphere() + '\n' +
                "Has rings = " + this.getHasRings() + '\n' +
                "Number of Moons = " + this.getNumberOfMoons();
    }
}

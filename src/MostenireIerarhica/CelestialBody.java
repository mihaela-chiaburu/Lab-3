package MostenireIerarhica;

public class CelestialBody {
    private String name;
    private Double mass;
    private Double radius;
    private Double distanceFromUs;
    private Boolean hasAtmosphere;

    public CelestialBody (String name, Double mass, Double radius, Double distanceFromUs, Boolean hasAtmosphere){
        this.name=name;
        this.mass=mass;
        this.radius=radius;
        this.distanceFromUs=distanceFromUs;
        this.hasAtmosphere=hasAtmosphere;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getDistanceFromUs() {
        return distanceFromUs;
    }

    public void setDistanceFromUs(double distanceFromUs) {
        this.distanceFromUs = distanceFromUs;
    }

    public boolean getHasAtmosphere() {
        return hasAtmosphere;
    }

    @Override
    public String toString() {
        return "CelestialBody:" +
                "Name = " + this.name + '\n' +
                "Mass = " + this.mass + '\n' +
                "Radius = " + this.radius + '\n' +
                "Distance from us = " + this.distanceFromUs + '\n' +
                "Has atmosphere = " + this.hasAtmosphere + '\n';
    }
}

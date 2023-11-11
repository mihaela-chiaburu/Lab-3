package MostenireIerarhica;

public class Moon extends CelestialBody{
    private String parentPlanet;
    private Boolean isNaturalSatellite;

    public Moon(String name, Double mass, Double radius, Double distanceFromUs,
                Boolean hasAtmosphere, String parentPlanet, Boolean isNaturalSatellite) {
        super(name, mass, radius, distanceFromUs, hasAtmosphere);
        this.parentPlanet = parentPlanet;
        this.isNaturalSatellite = isNaturalSatellite;
    }

    public String getParentPlanet() {
        return parentPlanet;
    }

    public Boolean getNaturalSatellite() {
        return isNaturalSatellite;
    }
    @Override
    public String toString() {
        return "Star:" +
                "Name = " + super.getName() + '\n' +
                "Mass = " + super.getMass() + '\n' +
                "Radius = " + super.getRadius() + '\n' +
                "Distance from us = " + super.getDistanceFromUs() + '\n' +
                "Has atmosphere = " + super.getHasAtmosphere() + '\n' +
                "Parent planet = " + this.getParentPlanet() + '\n' +
                "Is natural satellite = " + this.getNaturalSatellite() + '\n';
    }

}

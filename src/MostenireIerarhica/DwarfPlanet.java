package MostenireIerarhica;

public class DwarfPlanet extends Planet{
    Boolean isRecognizedAsPlanet;

    public DwarfPlanet(String name, Double mass, Double radius, Double distanceFromUs, Boolean hasAtmosphere, Boolean hasRings,
                       int numberOfMoons, Boolean isRecognizedAsPlanet) {
        super(name, mass, radius, distanceFromUs, hasAtmosphere, hasRings, numberOfMoons);
        this.isRecognizedAsPlanet = isRecognizedAsPlanet;
    }

    public Boolean getRecognizedAsPlanet() {
        return isRecognizedAsPlanet;
    }

    public void setRecognizedAsPlanet(Boolean recognizedAsPlanet) {
        isRecognizedAsPlanet = recognizedAsPlanet;
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
                "Number of Moons = " + this.getNumberOfMoons() + '\n'+
                "Is recognized as Planet = " + this.getRecognizedAsPlanet() + '\n';
    }
}

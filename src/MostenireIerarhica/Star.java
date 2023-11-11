package MostenireIerarhica;

public class Star extends CelestialBody{
    private Double temperature;  //kelvini
    private String spectralType;

    public Star(String name, Double mass, Double radius, Double distanceFromUs, Boolean hasAtmosphere, Double temperature, String spectralType){
        super(name, mass, radius, distanceFromUs, hasAtmosphere);
        this.temperature=temperature;
        this.spectralType=spectralType;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getSpectralType() {
        return spectralType;
    }

    public void setSpectralType(String spectralType) {
        this.spectralType = spectralType;
    }
    @Override
    public String toString() {
        return "Star:" +
                "Name = " + super.getName() + '\n' +
                "Mass = " + super.getMass() + '\n' +
                "Radius = " + super.getRadius() + '\n' +
                "Distance from us = " + super.getDistanceFromUs() + '\n' +
                "Has atmosphere = " + super.getHasAtmosphere() + '\n' +
                "Temperature = " + this.getTemperature() + '\n' +
                "Spectral Type = " + this.getSpectralType() + '\n';
    }
}

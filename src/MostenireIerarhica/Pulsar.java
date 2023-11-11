package MostenireIerarhica;

public class Pulsar extends Star{
    private double rotationPeriod;

    public Pulsar(String name, Double mass, Double radius, Double distanceFromUs, Boolean hasAtmosphere, Double temperature,
                  String spectralType, double rotationPeriod) {
        super(name, mass, radius, distanceFromUs, hasAtmosphere, temperature, spectralType);
        this.rotationPeriod = rotationPeriod;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
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
                "Spectral type = " + this.getSpectralType() + '\n' +
                "Rotation period = " + this.getRotationPeriod() + '\n';
    }
}

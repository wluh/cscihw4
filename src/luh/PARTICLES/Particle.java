package luh.PARTICLES;

import luh.SUPPORT.Mineral;

public abstract class Particle implements Scatterable {

    private String retrievalCode;

    private double pDiameter;
    private double pVolume;
    public double getpSurfaceArea() {
        return pSurfaceArea;
    }

    private double pSurfaceArea;

    public Mineral getpComposition() {
        return pComposition;
    }

    private Mineral pComposition;
    private boolean isRefined;

    public Particle(String retrievalCode, double pDiameter, double pVolume, double pSurfaceArea, Mineral pComposition, boolean isRefined) {
        this.retrievalCode = retrievalCode;
        this.pDiameter = pDiameter;
        this.pVolume = pVolume;
        this.pSurfaceArea = pSurfaceArea;
        this.pComposition = pComposition;
        this.isRefined = isRefined;
    }

    public void refine() {
        this.isRefined = true;
    }

    public void displayParticleInfo() {
        String outputMineralTitle = String.format("%s Particle: %s", pComposition, retrievalCode);
        System.out.printf("%-24s Scatter Light Factor: %.1f %n", outputMineralTitle, scatterLight());
        System.out.println("INFO:");
        System.out.printf("\t %-16s %-8.1f %-24s %-8.1f %n"
                        + "\t %-16s %-8.1f %-24s %-8s %n"
//                        + "%16s %8f %24s %8f %n"
                        + "\t %-16s %-8.1f %-24s %-8.1f %n %n",
                        "Diameter:", this.pDiameter, "Volume:", this.pVolume,
                        "Surface Area:", this.pSurfaceArea, "Refined:", this.isRefined,
                        "Mineral Mass:", pComposition.getMass(), "Mineral Strength:", pComposition.getStrength());
    }

    public abstract double scatterLight();
}

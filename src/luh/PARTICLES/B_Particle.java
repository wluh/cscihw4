package luh.PARTICLES;

import luh.SUPPORT.Mineral;

public class B_Particle extends Particle{

    public B_Particle(String retrievalCode) {
        super(retrievalCode, 1.7, 396, 18, Mineral.TRITANIUM, false);
    }

    static int BParticleCount = 0;

    @Override
    public double scatterLight() {
        return this.getpComposition().getStrength() * Math.sqrt(10);
    }
}

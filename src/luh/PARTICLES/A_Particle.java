package luh.PARTICLES;

import luh.SUPPORT.Mineral;

public class A_Particle extends Particle{

    public A_Particle(String retrievalCode) {
        super(retrievalCode, 1.3, 124, 7, Mineral.DILITHIUM, false);
    }

    static int AParticleCount = 0;

    @Override
    public double scatterLight() {
        return this.getpComposition().getStrength() * Math.sqrt(10) * 0.28 * this.getpComposition().getMass();
    }
}

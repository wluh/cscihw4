package luh.PARTICLES;

import luh.SUPPORT.Mineral;

public class C_Particle extends Particle{

    public C_Particle(String retrievalCode) {
        super(retrievalCode, 2.1, 518, 24, Mineral.UNANIUM, false);
    }

    static int CParticleCount = 0;

    @Override
    public double scatterLight() {
        return this.getpComposition().getMass() * 10;
    }
}

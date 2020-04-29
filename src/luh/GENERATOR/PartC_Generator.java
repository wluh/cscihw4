package luh.GENERATOR;

import luh.PARTICLES.A_Particle;
import luh.PARTICLES.C_Particle;
import luh.SUPPORT.Location;

public class PartC_Generator extends ParticleGenerator implements Generatable{

    static final String PTYPE = "C_Particle";
    static final int PCAPACITY = 180;
    static int GENERATED_COUNT = 0;


    public PartC_Generator(String pGeneratorID, Location pGeneratorPos) {
        super(pGeneratorID, pGeneratorPos);
    }

    public C_Particle generateParticle(){
        GENERATED_COUNT += 1;
        return new C_Particle("C" + GENERATED_COUNT);
    }
}


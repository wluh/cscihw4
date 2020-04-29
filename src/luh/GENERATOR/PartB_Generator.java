package luh.GENERATOR;

import luh.PARTICLES.A_Particle;
import luh.PARTICLES.B_Particle;
import luh.SUPPORT.Location;

public class PartB_Generator extends ParticleGenerator implements Generatable{

    static final String PTYPE = "B_Particle";
    static final int PCAPACITY = 180;
    static int GENERATED_COUNT = 0;


    public PartB_Generator(String pGeneratorID, Location pGeneratorPos) {
        super(pGeneratorID, pGeneratorPos);
    }

    public B_Particle generateParticle(){
        GENERATED_COUNT += 1;
        return new B_Particle("B" + GENERATED_COUNT);
    }
}


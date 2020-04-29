package luh.GENERATOR;

import luh.PARTICLES.A_Particle;
import luh.SUPPORT.Location;

public class PartA_Generator extends ParticleGenerator implements Generatable{

    static final String PTYPE = "A_Particle";
    static final int PCAPACITY = 100;
    static int GENERATED_COUNT = 0;


    public PartA_Generator(String pGeneratorID, Location pGeneratorPos) {
        super(pGeneratorID, pGeneratorPos);
    }

    public A_Particle generateParticle(){
        GENERATED_COUNT += 1;
        return new A_Particle("A" + GENERATED_COUNT);
    }
}

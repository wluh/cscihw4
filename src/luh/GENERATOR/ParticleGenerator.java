package luh.GENERATOR;
import luh.SUPPORT.*;

public abstract class ParticleGenerator {
    private String pGeneratorID;
    private Location pGeneratorPos;

    protected ParticleGenerator(String pGeneratorID, Location pGeneratorPos) {
        this.pGeneratorID = pGeneratorID;
        this.pGeneratorPos = pGeneratorPos;
    }

}

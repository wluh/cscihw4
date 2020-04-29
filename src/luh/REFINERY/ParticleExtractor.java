package luh.REFINERY;

import luh.COLLECTOR.ParticleCollector;
import luh.PARTICLES.Particle;
import luh.SUPPORT.Location;

import java.util.ArrayDeque;

public class ParticleExtractor {

    public ParticleExtractor(String extractorID, Location extratorPOS) {
        this.extractorID = extractorID;
        this.extratorPOS = extratorPOS;
    }

    private String extractorID;
    private Location extratorPOS;

    public ArrayDeque<Particle> getExtractorPool() {
        return extractorPool;
    }

    private ArrayDeque<Particle> extractorPool = new ArrayDeque<Particle>();
    static final int EXTRACTOR_CAPACITY = 500;

    public boolean extractParticles(ParticleCollector pc){
        if (pc.checkSize() + extractorPool.size() < EXTRACTOR_CAPACITY){
            extractorPool.addAll(pc.getCollectorPool());
            return true;
        }
        else {
            System.out.println("Extractor Pool does not have sufficient capacity");
            return false;
        }
    }

}

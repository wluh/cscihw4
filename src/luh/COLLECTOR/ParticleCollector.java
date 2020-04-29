package luh.COLLECTOR;

import luh.PARTICLES.Particle;
import luh.SUPPORT.Location;

import java.util.ArrayList;

public class ParticleCollector {

    public ParticleCollector(String collectorID, Location collectorPOS) {
        this.collectorID = collectorID;
        this.collectorPOS = collectorPOS;
    }

    private String collectorID;
    private Location collectorPOS;

    public ArrayList<Particle> getCollectorPool() {
        return collectorPool;
    }

    private ArrayList<Particle> collectorPool = new ArrayList<Particle>();
    static final int COLLECTOR_CAPACITY = 500;

    public boolean collectParticle(Particle p){
        if (collectorPool.size() < COLLECTOR_CAPACITY) {
            collectorPool.add(p);
            return true;
        }
        else {
            return false;
        }
    };

    public int checkSize(){
        return collectorPool.size();
    };

}

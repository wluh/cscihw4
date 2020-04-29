package luh.REFINERY;

import luh.PARTICLES.*;
import luh.SUPPORT.Location;

import java.util.ArrayList;

public class ParticleRefiner implements Refinable{

    private String refinerID;
    private String refinerName;
    private Location refinerPos;
    private ArrayList<Particle> pStorage = new ArrayList<Particle>();
    private ArrayList<A_Particle> Refined_AStorage = new ArrayList<A_Particle>();
    private ArrayList<B_Particle> Refined_BStorage = new ArrayList<B_Particle>();
    private ArrayList<C_Particle> Refined_CStorage = new ArrayList<C_Particle>();

    public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
        this.refinerID = refinerID;
        this.refinerName = refinerName;
        this.refinerPos = refinerPos;
    }

    public A_Particle refineAParticle(A_Particle p){
        p.refine();
        return p;
    }

    public B_Particle refineBParticle(B_Particle p){
        p.refine();
        return p;
    }

    public C_Particle refineCParticle(C_Particle p){
        p.refine();
        return p;
    }

    public boolean emptyExtractor(ParticleExtractor pe){
        pStorage.addAll(pe.getExtractorPool());
        Refined_AStorage.clear();
        Refined_BStorage.clear();
        Refined_CStorage.clear();
        try {
                for (Particle tempParticle: pStorage) {
                if (tempParticle instanceof A_Particle) {
                    Refined_AStorage.add((A_Particle) tempParticle);
                }
                else if (tempParticle instanceof B_Particle){
                    Refined_BStorage.add((B_Particle) tempParticle);
                }
                else {
                    Refined_CStorage.add((C_Particle) tempParticle);
                }
            }
                return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public void sampleParticles(int count){
        for(int i = 0; i < count; i += 1){
            pStorage.get(i).displayParticleInfo();
        }
    }

    public void displayInfo() {
        System.out.println("_____PARTICLE REFINER_____");
        System.out.println("Refiner ID: " + this.refinerID);
        System.out.println(this.refinerPos.toString());
        System.out.printf("Current Particle Storage: %d particles %n", pStorage.size());
        System.out.printf("Current A Particle Storage: %d particles %n", Refined_AStorage.size());
        System.out.printf("Current B Particle Storage: %d particles %n", Refined_BStorage.size());
        System.out.printf("Current C Particle Storage: %d particles %n", Refined_CStorage.size());

    }
}

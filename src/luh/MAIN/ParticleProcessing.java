package luh.MAIN;

import luh.COLLECTOR.ParticleCollector;
import luh.GENERATOR.*;
import luh.REFINERY.ParticleExtractor;
import luh.REFINERY.ParticleRefiner;
import luh.SUPPORT.Location;

public class ParticleProcessing {

    public static void main(String[] args){
        processParticles();
    }

    public static void processParticles(){
        PartA_Generator aGen = new PartA_Generator("AGEN-1", new Location("Alpha",10,10));
        PartB_Generator bGen = new PartB_Generator("BGEN-1", new Location("Beta",30,20));
        PartC_Generator cGen = new PartC_Generator("CGEN-1", new Location("Gamma",50,30));
        ParticleCollector pCol = new ParticleCollector("PCOLLECT", new Location("Lambda",70,40));
        ParticleExtractor pExt = new ParticleExtractor("PEXTRACT", new Location("SIgma",90,50));
        ParticleRefiner pRef = new ParticleRefiner("PREFINE", "PX", new Location("Tau",120, 60));
        for (int i = 0; i < 10; i++){
            pCol.collectParticle(aGen.generateParticle());
            pCol.collectParticle(bGen.generateParticle());
            pCol.collectParticle(cGen.generateParticle());
        }
        pExt.extractParticles(pCol);
        pRef.emptyExtractor(pExt);
        pRef.displayInfo();
        System.out.println();
        pRef.sampleParticles(3);

    }

}

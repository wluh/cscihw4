package luh.REFINERY;

import luh.PARTICLES.*;

public interface Refinable {

    public A_Particle refineAParticle(A_Particle p);
    public B_Particle refineBParticle(B_Particle p);
    public C_Particle refineCParticle(C_Particle p);

}

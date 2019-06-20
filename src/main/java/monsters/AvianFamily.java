package monsters;

import skills.*;

public interface AvianFamily extends Family {

    String family = "AVIAN";

    default Effect neutralEffect(){ return  new BasicEffect(); }
    default Effect fireEffect(){ return new BasicEffect(); }
    default Effect iceEffect(){ return new StrongEffect(); }
    default Effect windEffect(){ return new WeakEffect(); }
    default Effect elecEffect(){ return new StrongEffect(); }
    default Effect earthEffect(){ return new NoEffect(); }
    default Effect shadowEffect(){ return new BasicEffect(); }
    default Effect lightEffect(){ return new BasicEffect(); }
}

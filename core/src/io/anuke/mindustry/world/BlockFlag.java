package io.anuke.mindustry.world;

public enum BlockFlag {
    target(0),
    resupplyPoint(Float.MAX_VALUE),
    producer(Float.MAX_VALUE),
    repair(Float.MAX_VALUE);

    public final float cost;

    BlockFlag(float cost){
        if(cost < 0) throw new RuntimeException("Block flag costs cannot be < 0!");
        this.cost = cost;
    }
}
package com.rajeshchinni;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {    // added final

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    // constructor
    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();      // manually added
    }

    // getter
    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        //return satellites;
        return new HashSet<>(this.satellites);        // changes made here
    }

    // method
    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);

    }



}

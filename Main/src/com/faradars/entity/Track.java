package com.faradars.entity;

import java.util.ArrayList;

public class Track {

    private ArrayList<ICar> carOnTrack;
    public Track(ArrayList<ICar> carOnTrack){
        this.carOnTrack = carOnTrack;
    }

    public ICar startRace(){
        ICar car= carOnTrack.get(0);
        carOnTrack.remove(0);
        return car;
    }
    public int getCarOnTrack(){ return carOnTrack.size();}
}

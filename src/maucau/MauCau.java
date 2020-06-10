package maucau;

import java.util.ArrayList;
import java.util.Random;

public abstract class MauCau {
    protected ArrayList<String> tapCau = new ArrayList<String>();
    public String layCau(){
        thuThapCau();
        Random rd = new Random();
        return tapCau.get(rd.nextInt(tapCau.size()));
    }
    public abstract void thuThapCau();

    public ArrayList<String> getTapCau() {
        return tapCau;
    }
}

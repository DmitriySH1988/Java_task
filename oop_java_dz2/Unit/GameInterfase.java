package oop_java_dz2;

import java.util.ArrayList;

public interface GameInterfase {
    StringBuilder getInfo();
    void step(ArrayList<Human> team1, ArrayList<Human> team2);

}
package hu.nyirszikszi;

import hu.nyirszikszi.haromszog.Haromszog;

public class Main {

    public static void main(String[] args) {
        Haromszog h = new Haromszog(3,4,5);
        System.out.println(h.isHaromszog());
    }
}

package com.faradars;

import com.faradars.entity.Benz;
import com.faradars.entity.Ferrari;
import com.faradars.entity.ICar;
import com.faradars.entity.Track;
import com.faradars.util.CalcSpeed;

import java.util.ArrayList;


class Main {

    public static void main(String[] args) {

        ArrayList<ICar> car = getCar();

        Track track = new Track(car);

        startRacing(track);

    }

    private static ArrayList<ICar> getCar() {

        ArrayList<ICar> cars = new ArrayList<>(20);

        for (int i = 0; i < 4; i++) {
            cars.add(new Benz());
            cars.add(new Ferrari());
        }

        return cars;
    }

    private static void startRacing(Track track) {

        CalcSpeed calcSpeed = CalcSpeed.createCalcSpeed();

        int startingCarOnTrack = track.getCarOnTrack();

        System.out.printf("%n=============================================%n");
        System.out.printf("Starting Race, Number of Car on Track: %d%n", track.getCarOnTrack());
        System.out.printf("=============================================%n");


        int j = 0;
        int sumBenz = 0;
        int sumFerrari = 0;
        for (int i = 1; i <= startingCarOnTrack; i++) {
            j++;
            ICar car = track.startRace();

            double speedOnTrack = calcSpeed.getSpeed(car, track);
            if (car.getName() == "Benz   ") {
                System.out.printf("%s %d: %s Speed Km/h%n", car.getName(), j, (int) speedOnTrack);
                sumBenz += (int) speedOnTrack;
            } else {
                System.out.printf("%s %d: %s Speed km/h%n", car.getName(), --j, (int) speedOnTrack);
                sumFerrari += (int) speedOnTrack;
            }
        }

        System.out.printf("=============================================%n");
        System.out.printf("Race End of Cars on Track: %d%n", track.getCarOnTrack());
        System.out.printf("=============================================%n");

        if (sumBenz > sumFerrari) {
            System.out.printf("Avrage Speed Benz  %d  Ferrari %d, Team Benz Win....%n", sumBenz / 4, sumFerrari / 4);
        } else if (sumBenz < sumFerrari) {
            System.out.printf("Avrage Speed Benz  %d  Ferrari %d, Team Ferrari Win....%n", sumBenz / 4, sumFerrari / 4);
        } else {
            System.out.printf("Avrage Speed Benz  %d  Ferrari %d, Two teams equal ....%n", sumBenz / 4, sumFerrari / 4);
        }
    }
}


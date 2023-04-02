package com.example.oembed.codet;

public class Game {

    public static final int VICTORY = 3;
    public static final int TIE = 1;
    public static final int DEFEAT = 0;

    public int victoryPoint(String[] games) {
        int point = 0;

        for (String game : games) {
            String[] score = game.split("-");

            point += gameResult(
                    Integer.parseInt(score[0]),
                    Integer.parseInt(score[1]));
        }

        return point;
    }


    public int gameResult(int myScore, int relativeScore) {
        if (myScore > relativeScore) {
            return VICTORY;
        }
        if (myScore < relativeScore) {
            return DEFEAT;
        }

        return TIE;
    }
}

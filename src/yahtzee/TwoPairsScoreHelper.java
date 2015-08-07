package yahtzee;

import yahtzee.ICategoryScoreHelper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DanieleT
 */
public class TwoPairsScoreHelper implements ICategoryScoreHelper {

    public TwoPairsScoreHelper() {
    }

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        int numOfPairs = 0;

        int countInstance[] = roll.getCanonicalRepresentation();

        for (int i = 1; i < countInstance.length; i++) {
            if (countInstance[i] >= 2) {
                score += i * 2;
                ++numOfPairs;
            }
        }

        if (numOfPairs != 2) {
            score = 0;
        }

        return score;
    }

}

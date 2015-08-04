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
        int countInstance[] = new int[6];
        int numOfPairs = 0;

        for (int i = 0; i < roll.dice.length; i++) {
            countInstance[roll.dice[i] - 1] = countInstance[roll.dice[i] - 1] + 1;
        }

        for (int i = 0; i < countInstance.length; i++) {
            if (countInstance[i] >= 2) {
                score += (i + 1) * 2;
                ++numOfPairs;
            }
        }

        if (numOfPairs != 2) {
            score = 0;
        }

        return score;
    }

}

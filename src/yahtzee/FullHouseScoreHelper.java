/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

/**
 *
 * @author dtroiani
 */
public class FullHouseScoreHelper implements ICategoryScoreHelper {

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        int countInstance[] = new int[6];

        for (int i = 0; i < roll.dice.length; i++) {
            countInstance[roll.dice[i] - 1] = countInstance[roll.dice[i] - 1] + 1;
        }

        boolean foundThreeOfOne = false;
        boolean foundTwoOfOne = false;
        for (int i = 0; i < countInstance.length; i++) {
            if (countInstance[i] == 2) {
                foundTwoOfOne = true;
            } else if (countInstance[i] == 3) {
                foundThreeOfOne = true;
            }
        }
        if (foundTwoOfOne && foundThreeOfOne) {
            score = 25;
        }
        
        return score;
    }

}

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
        int countInstance[] = roll.getCanonicalRepresentation();

        boolean foundThreeOfOne = false;
        boolean foundTwoOfOne = false;
        for (int i = 1; i < countInstance.length; i++) {
            if (countInstance[i] == 2) {
                foundTwoOfOne = true;
            } else if (countInstance[i] == 3) {
                foundThreeOfOne = true;
            }
        }
        if (foundTwoOfOne && foundThreeOfOne) {
            return Constants.SCORE_FULLHOUSE;
        } else {
            return 0;
        }

    }

}

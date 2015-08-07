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
public class LargeStraightScoreHelper implements ICategoryScoreHelper {

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        int countInstance[] = roll.getCanonicalRepresentation();

        for (int offset = 1; offset < 3; offset++) {
            int itemsInStraight = 0;
            for (int i = offset; i < offset + 5; i++) {
                if (countInstance[i] == 1) {
                    itemsInStraight++;
                }
            }
            if (itemsInStraight >= 4) {
                score = Constants.SCORE_LARGESTRAIGHT;
                break;
            }
        }
        
        return score;
    }

}

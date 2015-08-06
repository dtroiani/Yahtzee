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
        int countInstance[] = new int[6];

        for (int i = 0; i < roll.dice.length; i++) {
            countInstance[roll.dice[i] - 1] = countInstance[roll.dice[i] - 1] + 1;
        }

        for (int offset = 0; offset < 2; offset++) {
            int itemsInStraight = 0;
            for (int i = offset; i < offset + 5; i++) {
                if (countInstance[i] == 1) {
                    itemsInStraight++;
                }
            }
            if (itemsInStraight >= 4) {
                score = 30;
                break;
            }
        }
        
        return score;
    }

}

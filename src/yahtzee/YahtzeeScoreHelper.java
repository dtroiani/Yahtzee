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
public class YahtzeeScoreHelper implements ICategoryScoreHelper {

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        int countInstance[] = new int[6];

        for (int i = 0; i < roll.dice.length; i++) {
            countInstance[roll.dice[i] - 1] = countInstance[roll.dice[i] - 1] + 1;
        }
        
        for (int i = 0; i < countInstance.length; i++) {
            if (countInstance[i] == 5) {
                score = 50;
                break;
            }
        }
        
        return score;
    }

}

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
public class ChanceScoreHelper implements ICategoryScoreHelper {

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        
        for (int i = 0; i < roll.dice.length; i++) {
            score += roll.dice[i];
        }
        
        return score;
    }
    
}

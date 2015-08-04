package yahtzee;


import yahtzee.Roll;
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
public class ThreesScoreHelper implements ICategoryScoreHelper {

    private static final int diceScoreToFind = 3;
    private static final int diceScoreToAdd = 3;    
    
    public ThreesScoreHelper() {
    }

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        
        for (int i = 0; i < 5; i++) {
            if (roll.dice[i] == diceScoreToFind) {
                score += diceScoreToAdd;
            }
        }
        
        return score;
    }

}

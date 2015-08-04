package yahtzee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DanieleT
 */
public class SixesScoreHelper implements ICategoryScoreHelper {

    private static final int diceScoreToFind = 6;
    private static final int diceScoreToAdd = 6;
    
    public SixesScoreHelper() {
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

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
public class FivesScoreHelper implements ICategoryScoreHelper {

    private static final int diceScoreToFind = 5;
    private static final int diceScoreToAdd = 5;
    
    public FivesScoreHelper() {
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

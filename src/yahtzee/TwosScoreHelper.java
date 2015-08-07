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
public class TwosScoreHelper implements ICategoryScoreHelper {

    public TwosScoreHelper() {
    }

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        
        for (int i = 0; i < roll.dice.length; i++) {
            if (roll.dice[i] == Constants.DICE_TWO) {
                score += roll.dice[i];
            }
        }
        
        return score;
    }
}

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

    private static final int diceScoreToFind = 2;
    private static final int diceScoreToAdd = 2;

    public TwosScoreHelper() {
    }

    @Override
    public int getScore(Roll roll) {
        int score = 0;

        if (roll.getDice1() == diceScoreToFind) {
            score += diceScoreToAdd;
        }
        if (roll.getDice2() == diceScoreToFind) {
            score += diceScoreToAdd;
        }
        if (roll.getDice3() == diceScoreToFind) {
            score += diceScoreToAdd;
        }
        if (roll.getDice4() == diceScoreToFind) {
            score += diceScoreToAdd;
        }
        if (roll.getDice5() == diceScoreToFind) {
            score += diceScoreToAdd;
        }

        return score;
    }

}
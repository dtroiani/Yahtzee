package yahtzee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dtroiani
 */
public class FourOfKindScoreHelper implements ICategoryScoreHelper {

    public FourOfKindScoreHelper() {
    }

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        int countInstance[] = new int[6];

        for (int i = 0; i < roll.dice.length; i++) {
            countInstance[roll.dice[i] - 1] = countInstance[roll.dice[i] - 1] + 1;
        }

        for (int i = 0; i < countInstance.length; i++) {
            if (countInstance[i] == 4) {
                score = (i + 1) * 4;
                break;
            }
        }

        return score;
    }

}

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
        
        int countInstance[] = roll.getCanonicalRepresentation();

        for (int i = 1; i < countInstance.length; i++) {
            if (countInstance[i] == 4) {
                score = i * 4;
                break;
            }
        }

        return score;
    }

}

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
public class PairScoreHelper implements ICategoryScoreHelper {

    public PairScoreHelper() {
    }

    @Override
    public int getScore(Roll roll) {
        int score = 0;
        int countInstance[] = roll.getCanonicalRepresentation();
        
        for (int i = countInstance.length - 1; i >= 1; i--) {
            if (countInstance[i] >= 2) {
                score = i * 2;
                break;
            }
        }
        
        return score;
    }
    
}

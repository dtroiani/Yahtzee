package yahtzee;


import yahtzee.Roll;
import yahtzee.ICategoryScoreHelper;
import yahtzee.CategoryEnum;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DanieleT
 */
public class YahtzeeScoreService {

    public static int getScore(Roll roll, CategoryEnum categoryEnum) {
        int score = 0;
        if (categoryEnum.equals(CategoryEnum.ONES)) {
            if (roll.getDice1() == 1) {
                ++score;
            }
            if (roll.getDice2() == 1) {
                ++score;
            }
            if (roll.getDice3() == 1) {
                ++score;
            }
            if (roll.getDice4() == 1) {
                ++score;
            }
            if (roll.getDice5() == 1) {
                ++score;
            }
        } else if (categoryEnum.equals(CategoryEnum.TWOS)) {
            if (roll.getDice1() == 2) {
                score += 2;
            }
            if (roll.getDice2() == 2) {
                score += 2;
            }
            if (roll.getDice3() == 2) {
                score += 2;
            }
            if (roll.getDice4() == 2) {
                score += 2;
            }
            if (roll.getDice5() == 2) {
                score += 2;
            }
        }
        
        return score;
    }

    public static int getScore(Roll roll, ICategoryScoreHelper csh) {

        return csh.getScore(roll);
    }    
    
}

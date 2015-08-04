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

   public static int getScore(Roll roll, ICategoryScoreHelper csh) {

        return csh.getScore(roll);
    }    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

/**
 *
 * @author DanieleT
 */
public class Yahtzee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score = YahtzeeScoreService.getScore(new Roll(1, 2, 5, 1, 3), new PairScoreHelper());
        
    }
    
}

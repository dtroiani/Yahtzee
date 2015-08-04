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
public class Roll {

    public int dice[] = new int[5];
    
    public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dice[0] = dice1;
        dice[1] = dice2;
        dice[2] = dice3;
        dice[3] = dice4;
        dice[4] = dice5;
    }
 
}

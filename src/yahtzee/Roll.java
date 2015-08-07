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
    
    /**
    * Returns a canonical representation of the dice roll.
    * The representation consists of a integer array C[] where C[i] is equal to the sum of the dice occurrences with rank i.
    * For example, for a roll(2, 4, 3, 2, 4) the result is C[1]=0, C2=[2], C[3]=1, C[4]=2, C[5]=0, C[6]=0
    * N.B. Ignore the element with index 0
    * @return array of integer C where C[i] is the number of occurrences of dice with rank equal to i
    */
    public int[] getCanonicalRepresentation() {
        int countInstance[] = new int[7];
        
        for (int i = 0; i < dice.length; i++) {
            countInstance[dice[i]] = countInstance[dice[i]] + 1;
        }
        
        return countInstance;
    }
 
}

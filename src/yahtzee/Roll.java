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

    private int dice1;
    private int dice2;
    private int dice3;
    private int dice4;
    private int dice5;
    
    public Roll(int dice1, int dice2, int dice3, int dice4, int dice5) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.dice3 = dice3;
        this.dice4 = dice4;
        this.dice5 = dice5;
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public int getDice3() {
        return dice3;
    }

    public int getDice4() {
        return dice4;
    }

    public int getDice5() {
        return dice5;
    }
   
}
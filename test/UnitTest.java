/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import yahtzee.TwosScoreHelper;
import yahtzee.YahtzeeScoreService;
import yahtzee.ThreesScoreHelper;
import yahtzee.Roll;
import yahtzee.CategoryEnum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yahtzee.FivesScoreHelper;
import yahtzee.FoursScoreHelper;
import yahtzee.OnesScoreHelper;
import yahtzee.SixesScoreHelper;

/**
 *
 * @author DanieleT
 */
public class UnitTest {

    public UnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsOnesAndCategoryIsOnes() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 1, 2, 4, 4), new OnesScoreHelper());
        assertEquals(score, 2);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainOnesAndCategoryIsOnes() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 5, 2, 4, 4), new OnesScoreHelper());
        assertEquals(score, 0);
    }
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwosAndCategoryIsTwos() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 5, 2, 4, 2), new TwosScoreHelper());
        assertEquals(score, 4);
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainTwosAndCategoryIsTwos() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 5, 6, 4, 4), new TwosScoreHelper());
        assertEquals(score, 0);
    }
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsThreesAndCategoryIsThrees() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 5, 3, 4, 3), new ThreesScoreHelper());
        assertEquals(score, 9);
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesnContainThreesAndCategoryIsThrees() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 5, 2, 4, 1), new ThreesScoreHelper());
        assertEquals(score, 0);
    }    
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsFoursAndCategoryIsFours() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 5, 4, 4, 3), new FoursScoreHelper());
        assertEquals(score, 8);
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesnContainFoursAndCategoryIsFours() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 5, 1, 2, 3), new FoursScoreHelper());
        assertEquals(score, 0);
    }
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsFivesAndCategoryIsFives() {
        int score = YahtzeeScoreService.getScore(new Roll(5, 5, 4, 2, 5), new FivesScoreHelper());
        assertEquals(score, 15);
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFivesAndCategoryIsFives() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 6, 4, 2, 1), new FivesScoreHelper());
        assertEquals(score, 0);
    }
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsSixesAndCategoryIsSixes() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 6, 6, 2, 1), new SixesScoreHelper());
        assertEquals(score, 12);
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainSixesAndCategoryIsSixes() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 3, 5, 2, 1), new SixesScoreHelper());
        assertEquals(score, 0);
    } 
}

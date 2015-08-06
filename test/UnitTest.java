/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import yahtzee.ThreeOfKindScoreHelper;
import yahtzee.TwoPairsScoreHelper;
import yahtzee.PairScoreHelper;
import yahtzee.TwosScoreHelper;
import yahtzee.YahtzeeScoreService;
import yahtzee.ThreesScoreHelper;
import yahtzee.Roll;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yahtzee.ChanceScoreHelper;
import yahtzee.FivesScoreHelper;
import yahtzee.FourOfKindScoreHelper;
import yahtzee.FoursScoreHelper;
import yahtzee.FullHouseScoreHelper;
import yahtzee.LargeStraightScoreHelper;
import yahtzee.OnesScoreHelper;
import yahtzee.SixesScoreHelper;
import yahtzee.SmallStraightScoreHelper;
import yahtzee.YahtzeeScoreHelper;

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

    // Ones, Twos, Threes, Fours, Fives, Sixes
    
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
    
    // Pair
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals1() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 2, 5, 1, 3), new PairScoreHelper());
        assertEquals(score, 2);
    }
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals2() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 2, 2, 1, 3), new PairScoreHelper());
        assertEquals(score, 4);
    }      
 
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals3() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 2, 6, 3, 3), new PairScoreHelper());
        assertEquals(score, 6);
    }
        
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals4() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 2, 5, 4, 4), new PairScoreHelper());
        assertEquals(score, 8);
    }
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals5() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 2, 5, 4, 5), new PairScoreHelper());
        assertEquals(score, 10);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals6() {
        int score = YahtzeeScoreService.getScore(new Roll(5, 6, 5, 6, 6), new PairScoreHelper());
        assertEquals(score, 12);
    }    
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainTwoMatchingDice() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 1, 3, 5, 6), new PairScoreHelper());
        assertEquals(score, 0);
    }
    
    // Two pairs
    
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoPairs() {
        int score = YahtzeeScoreService.getScore(new Roll(5, 6, 5, 2, 6), new TwoPairsScoreHelper());
        assertEquals(score, 22);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainTwoPairs() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 3, 5, 2, 6), new TwoPairsScoreHelper());
        assertEquals(score, 0);
    }
    
    // Three of a kind
    
    @Test
    public void shouldScoreBeTheSumOfTheseDiceIfRollContainsThreeOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 3, 5, 3, 6), new ThreeOfKindScoreHelper());
        assertEquals(score, 9);  
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainThreeOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 3, 5, 3, 6), new ThreeOfKindScoreHelper());
        assertEquals(score, 0);  
    }
    
    // Four of a kind
    
    @Test
    public void shouldScoreBeTheSumOfTheseDiceIfRollContainsFourOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 3, 5, 3, 3), new FourOfKindScoreHelper());
        assertEquals(score, 12);  
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFourOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 3, 5, 3, 6), new FourOfKindScoreHelper());
        assertEquals(score, 0);  
    }
    
    // Small straight
    
    @Test
    public void shouldScoreBeThirtyIfRollContainsSmallStraightFromOneToFour() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 2, 3, 4, 6), new SmallStraightScoreHelper());
        assertEquals(score, 30);        
    }

    @Test
    public void shouldScoreBeThirtyIfRollContainsSmallStraightFrowTwoToFive() {        
        int score = YahtzeeScoreService.getScore(new Roll(3, 3, 4, 5, 2), new SmallStraightScoreHelper());
        assertEquals(score, 30);      
    }
    
    @Test
    public void shouldScoreBeThirtyIfRollContainsSmallStraightFrowThreeToSix() {        
        int score = YahtzeeScoreService.getScore(new Roll(3, 6, 4, 5, 1), new SmallStraightScoreHelper());
        assertEquals(score, 30);      
    }    
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainSmallStraight() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 3, 5, 3, 4), new SmallStraightScoreHelper());
        assertEquals(score, 0);  
    }
    
    // Large straight
    
    @Test
    public void shouldScoreBeFourtyIfRollContainsLargeStraightFromOneToFive() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 2, 3, 4, 5), new LargeStraightScoreHelper());
        assertEquals(score, 30);        
    }
    
    @Test
    public void shouldScoreBeFourtyIfRollContainsLargeStraightFromTwoToSix() {
        int score = YahtzeeScoreService.getScore(new Roll(4, 2, 3, 6, 5), new LargeStraightScoreHelper());
        assertEquals(score, 30);        
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainLargeStraight() {
        int score = YahtzeeScoreService.getScore(new Roll(4, 2, 3, 5, 5), new LargeStraightScoreHelper());
        assertEquals(score, 0);        
    }
    
    // Yahtzee
    
    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToOne() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 1, 1, 1, 1), new YahtzeeScoreHelper());
        assertEquals(score, 50);        
    }
    
    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToTwo() {
        int score = YahtzeeScoreService.getScore(new Roll(2, 2, 2, 2, 2), new YahtzeeScoreHelper());
        assertEquals(score, 50);        
    }
    
    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToThree() {
        int score = YahtzeeScoreService.getScore(new Roll(3, 3, 3, 3, 3), new YahtzeeScoreHelper());
        assertEquals(score, 50);        
    }
    
    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToFour() {
        int score = YahtzeeScoreService.getScore(new Roll(4, 4, 4, 4, 4), new YahtzeeScoreHelper());
        assertEquals(score, 50);        
    }
    
    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToFive() {
        int score = YahtzeeScoreService.getScore(new Roll(5, 5, 5, 5, 5), new YahtzeeScoreHelper());
        assertEquals(score, 50);        
    }
    
    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToSix() {
        int score = YahtzeeScoreService.getScore(new Roll(6, 6, 6, 6, 6), new YahtzeeScoreHelper());
        assertEquals(score, 50);        
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFiveSameDice() {
        int score = YahtzeeScoreService.getScore(new Roll(6, 6, 6, 1, 6), new YahtzeeScoreHelper());
        assertEquals(score, 0);        
    }
    
    // Chance
    
    @Test
    public void shouldScoreBeSumOfAllDiceIfCategoryIsChange() {
        int score = YahtzeeScoreService.getScore(new Roll(1, 5, 4, 6, 6), new ChanceScoreHelper());
        assertEquals(score, 22);  
    }
    
    // Full house
    
    @Test
    public void shouldScoreBeTwentyFiveIfRollContainsFullHouse() {
        int score = YahtzeeScoreService.getScore(new Roll(4, 6, 4, 6, 6), new FullHouseScoreHelper());
        assertEquals(score, 25);  
    }
    
    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFullHouse() {
        int score = YahtzeeScoreService.getScore(new Roll(4, 4, 4, 1, 6), new FullHouseScoreHelper());
        assertEquals(score, 0);  
    }    
}

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
import yahtzee.Constants;
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
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_ONE, Constants.DICE_TWO, Constants.DICE_FOUR, Constants.DICE_FOUR), new OnesScoreHelper());
        assertEquals(score, 2);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainOnesAndCategoryIsOnes() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_TWO, Constants.DICE_FOUR, Constants.DICE_FOUR), new OnesScoreHelper());
        assertEquals(score, 0);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwosAndCategoryIsTwos() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_TWO, Constants.DICE_FOUR, Constants.DICE_TWO), new TwosScoreHelper());
        assertEquals(score, 4);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainTwosAndCategoryIsTwos() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_SIX, Constants.DICE_FOUR, Constants.DICE_FOUR), new TwosScoreHelper());
        assertEquals(score, 0);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsThreesAndCategoryIsThrees() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_THREE, Constants.DICE_FOUR, Constants.DICE_THREE), new ThreesScoreHelper());
        assertEquals(score, 9);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesnContainThreesAndCategoryIsThrees() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_FIVE, Constants.DICE_TWO, Constants.DICE_FOUR, Constants.DICE_ONE), new ThreesScoreHelper());
        assertEquals(score, 0);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsFoursAndCategoryIsFours() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_FOUR, Constants.DICE_FOUR, Constants.DICE_THREE), new FoursScoreHelper());
        assertEquals(score, 8);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesnContainFoursAndCategoryIsFours() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_ONE, Constants.DICE_TWO, Constants.DICE_THREE), new FoursScoreHelper());
        assertEquals(score, 0);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsFivesAndCategoryIsFives() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FIVE, Constants.DICE_FIVE, Constants.DICE_FOUR, Constants.DICE_TWO, Constants.DICE_FIVE), new FivesScoreHelper());
        assertEquals(score, 15);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFivesAndCategoryIsFives() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_SIX, Constants.DICE_FOUR, Constants.DICE_TWO, Constants.DICE_ONE), new FivesScoreHelper());
        assertEquals(score, 0);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsSixesAndCategoryIsSixes() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_SIX, Constants.DICE_SIX, Constants.DICE_TWO, Constants.DICE_ONE), new SixesScoreHelper());
        assertEquals(score, 12);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainSixesAndCategoryIsSixes() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_TWO, Constants.DICE_ONE), new SixesScoreHelper());
        assertEquals(score, 0);
    }

    // Pair
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals1() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_TWO, Constants.DICE_FIVE, Constants.DICE_ONE, Constants.DICE_THREE), new PairScoreHelper());
        assertEquals(score, 2);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals2() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_TWO, Constants.DICE_TWO, Constants.DICE_ONE, Constants.DICE_THREE), new PairScoreHelper());
        assertEquals(score, 4);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals3() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_TWO, Constants.DICE_SIX, Constants.DICE_THREE, Constants.DICE_THREE), new PairScoreHelper());
        assertEquals(score, 6);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals4() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_TWO, Constants.DICE_FIVE, Constants.DICE_FOUR, Constants.DICE_FOUR), new PairScoreHelper());
        assertEquals(score, 8);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals5() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_TWO, Constants.DICE_FIVE, Constants.DICE_FOUR, Constants.DICE_FIVE), new PairScoreHelper());
        assertEquals(score, 10);
    }

    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoMatchingDiceEquals6() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FIVE, Constants.DICE_SIX, Constants.DICE_FIVE, Constants.DICE_SIX, Constants.DICE_SIX), new PairScoreHelper());
        assertEquals(score, 12);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainTwoMatchingDice() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_ONE, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_SIX), new PairScoreHelper());
        assertEquals(score, 0);
    }

    // Two pairs
    @Test
    public void shouldScoreBeGreaterThanZeroIfRollContainsTwoPairs() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FIVE, Constants.DICE_SIX, Constants.DICE_FIVE, Constants.DICE_TWO, Constants.DICE_SIX), new TwoPairsScoreHelper());
        assertEquals(score, 22);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainTwoPairs() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_TWO, Constants.DICE_SIX), new TwoPairsScoreHelper());
        assertEquals(score, 0);
    }

    // Three of a kind
    @Test
    public void shouldScoreBeTheSumOfTheseDiceIfRollContainsThreeOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_THREE, Constants.DICE_SIX), new ThreeOfKindScoreHelper());
        assertEquals(score, 9);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainThreeOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_THREE, Constants.DICE_SIX), new ThreeOfKindScoreHelper());
        assertEquals(score, 0);
    }

    // Four of a kind
    @Test
    public void shouldScoreBeTheSumOfTheseDiceIfRollContainsFourOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_THREE, Constants.DICE_THREE), new FourOfKindScoreHelper());
        assertEquals(score, 12);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFourOfAKind() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_THREE, Constants.DICE_SIX), new FourOfKindScoreHelper());
        assertEquals(score, 0);
    }

    // Small straight
    @Test
    public void shouldScoreBeThirtyIfRollContainsSmallStraightFromOneToFour() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_TWO, Constants.DICE_THREE, Constants.DICE_FOUR, Constants.DICE_SIX), new SmallStraightScoreHelper());
        assertEquals(score, 30);
    }

    @Test
    public void shouldScoreBeThirtyIfRollContainsSmallStraightFrowTwoToFive() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_FOUR, Constants.DICE_FIVE, Constants.DICE_TWO), new SmallStraightScoreHelper());
        assertEquals(score, 30);
    }

    @Test
    public void shouldScoreBeThirtyIfRollContainsSmallStraightFrowThreeToSix() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_SIX, Constants.DICE_FOUR, Constants.DICE_FIVE, Constants.DICE_ONE), new SmallStraightScoreHelper());
        assertEquals(score, 30);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainSmallStraight() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_THREE, Constants.DICE_FOUR), new SmallStraightScoreHelper());
        assertEquals(score, 0);
    }

    // Large straight
    @Test
    public void shouldScoreBeFourtyIfRollContainsLargeStraightFromOneToFive() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_TWO, Constants.DICE_THREE, Constants.DICE_FOUR, Constants.DICE_FIVE), new LargeStraightScoreHelper());
        assertEquals(score, 40);
    }

    @Test
    public void shouldScoreBeFourtyIfRollContainsLargeStraightFromTwoToSix() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FOUR, Constants.DICE_TWO, Constants.DICE_THREE, Constants.DICE_SIX, Constants.DICE_FIVE), new LargeStraightScoreHelper());
        assertEquals(score, 40);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainLargeStraight() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FOUR, Constants.DICE_TWO, Constants.DICE_THREE, Constants.DICE_FIVE, Constants.DICE_FIVE), new LargeStraightScoreHelper());
        assertEquals(score, 0);
    }

    // Yahtzee
    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToOne() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_ONE, Constants.DICE_ONE, Constants.DICE_ONE, Constants.DICE_ONE), new YahtzeeScoreHelper());
        assertEquals(score, 50);
    }

    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToTwo() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_TWO, Constants.DICE_TWO, Constants.DICE_TWO, Constants.DICE_TWO, Constants.DICE_TWO), new YahtzeeScoreHelper());
        assertEquals(score, 50);
    }

    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToThree() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_THREE, Constants.DICE_THREE), new YahtzeeScoreHelper());
        assertEquals(score, 50);
    }

    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToFour() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FOUR, Constants.DICE_FOUR, Constants.DICE_FOUR, Constants.DICE_FOUR, Constants.DICE_FOUR), new YahtzeeScoreHelper());
        assertEquals(score, 50);
    }

    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToFive() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FIVE, Constants.DICE_FIVE, Constants.DICE_FIVE, Constants.DICE_FIVE, Constants.DICE_FIVE), new YahtzeeScoreHelper());
        assertEquals(score, 50);
    }

    @Test
    public void shouldScoreBeFiftyIfRollContainsFiveDiceEqualsToSix() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_SIX, Constants.DICE_SIX, Constants.DICE_SIX, Constants.DICE_SIX, Constants.DICE_SIX), new YahtzeeScoreHelper());
        assertEquals(score, 50);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFiveSameDice() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_SIX, Constants.DICE_SIX, Constants.DICE_SIX, Constants.DICE_ONE, Constants.DICE_SIX), new YahtzeeScoreHelper());
        assertEquals(score, 0);
    }

    // Chance
    @Test
    public void shouldScoreBeSumOfAllDiceIfCategoryIsChange() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_ONE, Constants.DICE_FIVE, Constants.DICE_FOUR, Constants.DICE_SIX, Constants.DICE_SIX), new ChanceScoreHelper());
        assertEquals(score, 22);
    }

    // Full house
    @Test
    public void shouldScoreBeTwentyFiveIfRollContainsFullHouse() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FOUR, Constants.DICE_SIX, Constants.DICE_FOUR, Constants.DICE_SIX, Constants.DICE_SIX), new FullHouseScoreHelper());
        assertEquals(score, 25);
    }

    @Test
    public void shouldScoreBeZeroIfRollDoesntContainFullHouse() {
        int score = YahtzeeScoreService.getScore(new Roll(Constants.DICE_FOUR, Constants.DICE_FOUR, Constants.DICE_FOUR, Constants.DICE_ONE, Constants.DICE_SIX), new FullHouseScoreHelper());
        assertEquals(score, 0);
    }
}

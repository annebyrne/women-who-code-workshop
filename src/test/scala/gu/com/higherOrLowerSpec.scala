package gu.com

import org.scalatest.{FlatSpec, Matchers}

class higherOrLowerSpec extends FlatSpec with Matchers {

  it should "give the player a shuffled deck of cards, numbered 1 to 10 in random order" in {
    val shuffledDeck = HigherOrLower.shuffledDeck
    val secondShuffle = HigherOrLower.shuffledDeck
    val thirdShuffle = HigherOrLower.shuffledDeck
    val requiredCards = 10
    val randomCheck = shuffledDeck != secondShuffle && shuffledDeck != thirdShuffle && thirdShuffle != secondShuffle

    shuffledDeck.isInstanceOf[List[Int]] shouldBe true
    shuffledDeck.length shouldBe requiredCards
    randomCheck shouldBe true
  }

  it should "compare the top two cards in the deck" in {
    val topCard = 5
    val nextCard = 3
    val altCard = 8

    HigherOrLower.isGuessCorrect(topCard, nextCard, "lower") shouldBe true
    HigherOrLower.isGuessCorrect(topCard, nextCard, "higher") shouldBe false
    HigherOrLower.isGuessCorrect(topCard, altCard, "lower") shouldBe false
  }

  it should "end the game if there are no more cards left" in {
  }

  it should "keep playing as long as the guess is correct" in {

  }


}
package gu.com


object HigherOrLower {

  def beginGame = {
    println("Hello! Let's play a game of higher or lower.")
    playGame(shuffledDeck)
  }

  def shuffledDeck: List[Int] = {
    ???
  }

  def playGame(cards: List[Int]): Unit = {
    cards match {
      case ??? =>  ???
      case ??? => println("Congratulations! You've won the game!")
    }
  }

  def isGuessCorrect(topCard: Int, nextCard: Int, guess: String): Boolean = {
    ???
  }

  def guess(head: Int, nextCard: Int, tail: List[Int]) = {
    println(s"The card is ${head}. Do you think the next card is higher or lower?")
    val input = readLine()
    ???
  }

}


object Main {
  def main (args: Array[String]): Unit = {
    HigherOrLower.beginGame
  }
}
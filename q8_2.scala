import scala.io.StdIn.readInt

object q8_2 {
  def main(args: Array[String]) = {
    print("Input a integer number: ")
    var input = readInt()

    val multipleOfThree = (n: Int) => n % 3 == 0
    val multipleOfFive = (n: Int) => n % 5 == 0
    val multipleOfBoth = (n: Int) => multipleOfThree(n) && multipleOfFive(n)

    val category = input match {
      case n if multipleOfBoth(n) => "Multiple of Both Three and Five"
      case n if multipleOfThree(n) => "Multiple of Three"
      case n if multipleOfFive(n) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    print(category)
  }
}
import scala.io.StdIn

object step0_repl {
  def main(args: Array[String]): Unit = {
    while (true) {
      val input = StdIn.readLine("input> ")
      if (isExit(input)) { return }
        try {
          rep(input)
        } catch {
          case e: Exception => {
            println(s"Error: ${e.getMessage}")
            println(s"    ${e.getStackTrace.mkString("\n     ")}")
          }
        }
    }
  }

  private def rep(input: String): Unit = println(eval(read(input)))

  private def read(input: String): String = input

  private def eval(input: String): String = input

  private def isExit(input: String) = input == null || input == "exit"
}

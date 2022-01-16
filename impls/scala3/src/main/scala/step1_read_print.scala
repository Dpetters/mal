import AST.MalExpr

import scala.io.StdIn

object step1_read_print {
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

  private def read(input: String): MalExpr = Parser.parse(input)

  private def eval(input: MalExpr): String = Printer.pr_str(input)

  private def isExit(input: String) = input == null || input == "exit"
}

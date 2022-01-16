import AST.MalExpr

object Printer {
  def pr_str(malExpr: MalExpr): String = {
    malExpr match {
      case AST.MalSymbol(symbol) => symbol.name
      case AST.MalNumber(number) => number.toString
      case AST.MalList(elements) => elements.map(pr_str).mkString("(", " ", ")")
    }
  }
}

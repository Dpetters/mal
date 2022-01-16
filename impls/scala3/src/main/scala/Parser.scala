import AST.{MalExpr, MalList, MalNumber, MalSymbol}

import scala.util.parsing.combinator.*

object Parser extends JavaTokenParsers {
  def number: Parser[MalNumber] = """\d+""".r ^^ { (x: String) => MalNumber(x.toInt) }
  def symbol: Parser[MalSymbol] = """[a-z\*\+\-\/]+""".r ^^ { (x: String) => MalSymbol(Symbol(x)) }
  def list: Parser[MalList] = "(" ~> rep(expr) <~ ")" ^^ { (x: List[MalExpr]) => MalList(x) }
  def expr: Parser[MalExpr] = number | symbol | list

  def parse(input: String): MalExpr = {
    parseAll(expr, input) match {
      case Success(result, _) => result
      case Failure(msg, _) => throw new Exception(msg)
      case Error(msg, _) => throw new Exception(msg)
    }
  }
}

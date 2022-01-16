object AST {
  sealed trait MalExpr

  case class MalSymbol(symbol: Symbol) extends MalExpr
  case class MalNumber(number: Integer) extends MalExpr
  case class MalList(elements: Seq[MalExpr]) extends MalExpr
}

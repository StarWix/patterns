package decorator.base

/**
  * Created by starwix on 24.5.16.
  */
sealed trait Size
case class SmallSize() extends Size
case class MediumSize() extends Size
case class BigSize() extends Size

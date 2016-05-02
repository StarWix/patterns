package observer.oop

/**
  * Created by starwix on 3.5.16.
  */
sealed trait Button
case class LeftButton() extends Button
case class RightButton() extends Button

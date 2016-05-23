package observer.oop

/**
  * Created by starwix on 3.5.16.
  */
object Main extends App {
  val mice = Mice()

  val first = LoggerObserver(1)
  LoggerObserver(2, Option(mice))
  LoggerObserver(3)

  RemoteObserver(4, Option(mice))
  val fifth = RemoteObserver(5, Option(mice))

  mice.updateStatus(2, Option(LeftButton()), true)

  println("-------------")

  mice.registerObserver(first)
  mice.removeObserver(fifth)
  mice.updateStatus(2, None, false)
}

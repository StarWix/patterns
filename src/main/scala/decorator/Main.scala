package decorator

import decorator.base.SmallSize
import decorator.beverages.DarkRoast
import decorator.condiment.{Milk, Soy}

/**
  * Created by starwix on 24.5.16.
  */
object Main extends App {
  val darkRoast = DarkRoast(SmallSize())
  println(s"${darkRoast.description} (${darkRoast.size}): ${darkRoast.cost}")

  val darkRoastWithMilk = Milk(darkRoast)
  println(s"${darkRoastWithMilk.description} (${darkRoastWithMilk.size}): ${darkRoastWithMilk.cost}")

  val darkRoastWithMilkAndSoy = Soy(darkRoastWithMilk)
  println(s"${darkRoastWithMilkAndSoy.description} (${darkRoastWithMilkAndSoy.size}): ${darkRoastWithMilkAndSoy.cost}")
}

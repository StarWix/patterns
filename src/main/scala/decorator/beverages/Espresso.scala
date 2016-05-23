package decorator.beverages

import decorator.base.{Beverage, Size}

/**
  * Created by starwix on 24.5.16.
  */
case class Espresso(val size: Size) extends Beverage {
  override def cost: Double = 1.99
  override def description: String = "Espresso"
}

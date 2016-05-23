package decorator.condiment

import decorator.base.{Beverage, CondimentDecorator, Size}

/**
  * Created by starwix on 24.5.16.
  */
case class Milk(beverage: Beverage) extends CondimentDecorator(beverage) {
  override def cost: Double = super.cost + 0.05
  override def description: String = super.description + separator + "Milk"
}

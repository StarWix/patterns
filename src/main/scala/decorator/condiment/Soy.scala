package decorator.condiment

import decorator.base._

/**
  * Created by starwix on 24.5.16.
  */
case class Soy(beverage: Beverage) extends CondimentDecorator(beverage) {
  override def cost: Double = super.cost + (size match {
    case _: SmallSize => 0.10
    case _: MediumSize => 0.15
    case _: BigSize => 0.20
  })
  override def description: String = super.description + separator + "Soy"
}

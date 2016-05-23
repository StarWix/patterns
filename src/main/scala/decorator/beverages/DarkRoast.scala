package decorator.beverages

import decorator.base._

/**
 * Created by starwix on 24.5.16.
 */
case class DarkRoast(size: Size = MediumSize()) extends Beverage {
  override def cost: Double = size match {
    case _: SmallSize => 0.30
    case _: MediumSize => 0.50
    case _: BigSize => 0.60
  }

  override def description: String = "Dark Roast"
}

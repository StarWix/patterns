package decorator.base

/**
  * Created by starwix on 24.5.16.
  */
abstract class CondimentDecorator(beverage: Beverage) extends Beverage {
  protected val separator = ", "
  final override def size: Size = beverage.size
  override def cost: Double = beverage.cost
  override def description: String = beverage.description
}

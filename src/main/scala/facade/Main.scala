package facade

import facade.support.{Shipping, OrderFullFill, Billing}

/**
  * Created by StarWix on 24.05.2016.
  */
object Main extends App {
  val facade = new Facade(new Billing, new OrderFullFill, new Shipping)

  facade.order
  facade.ship
  facade.takeMoney
}

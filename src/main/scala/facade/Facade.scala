package facade

import facade.support.{Shipping, OrderFullFill, Billing}

/**
  * Created by StarWix on 24.05.2016.
  */
class Facade(billing: Billing, orderFullFill: OrderFullFill, shipping: Shipping) {
  def order = {
    orderFullFill.check
    orderFullFill.order
    billing.createInvoices
    billing.bill
  }

  def takeMoney = {
    shipping.takeMoney
    billing.takeMoney
  }

  def ship = {
    shipping.ship
  }
}

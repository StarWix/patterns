package iterator

import iterator.entities.{Item, Category}

/**
  * Created by StarWix on 27.05.2016.
  */
object Main extends App {
  val emptyCategory = Category("Empty", "", List())
  val category1 = Category("Category1", "", List(
    Item("Item1", "1", 1),
    Item("Item2", "1", 2),
    Item("Item3", "1", 3),
    Item("Item4", "1", 4)
  ))
  val category2 = Category("Category2", "", List(
    Item("Item1", "2", 4),
    Item("Item2", "2", 3),
    Item("Item3", "2", 2),
    Item("Item4", "2", 1)
  ))

  val vendor = Vendor(List(emptyCategory, category1, category2))

  println("printAllItems")
  vendor.printAllItems

  println("printItemsByCategory")
  vendor.printItems(category1)

  println("printItemsByPrice")
  vendor.printItems(2, 3)

  println("printItemsByTitle")
  vendor.printItems("Item2")
}

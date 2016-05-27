package iterator

import iterator.entities.{Item, Category}

/**
  * Created by StarWix on 27.05.2016.
  */
case class Vendor(categories: List[Category]) {
  private def printItemsByCriteria(f: Item => Boolean)(category: Category) = {
    val it = category.iterator
    while(it.hasNext) {
      val item = it.next
      if (f(item)) {
        println(item)
      }
    }
  }

  private def printAllItemsByCriteria(f: Item => Boolean) = {
    categories.foreach(c => printItemsByCriteria(f)(c))
  }

  def printItems(category: Category): Unit = printItemsByCriteria(_ => true)(category)
  def printAllItems: Unit = printAllItemsByCriteria(_ => true)
  def printItems(min: Int, max: Int): Unit = printAllItemsByCriteria(item => min <= item.price && item.price < max)
  def printItems(title: String): Unit = printAllItemsByCriteria(item => item.title == title)
}

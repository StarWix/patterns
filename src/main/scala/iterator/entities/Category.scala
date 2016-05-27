package iterator.entities

import iterator.Iterator

/**
  * Created by StarWix on 27.05.2016.
  */
case class Category(title: String, description: String, menuComponents: List[Item]) {
  def iterator: Iterator[Item] = new Iterator[Item] {
    private var position: Int = 0

    override def hasNext: Boolean = menuComponents.size > position
    override def next: Item = {
      if (!hasNext) {
        throw new NoSuchElementException
      }
      val component = menuComponents(position)
      position += 1
      component
    }

    override def remove: Unit = {
      throw new UnsupportedOperationException
    }

    override def hasPrevious: Boolean = position < 0
    override def previous: Item = {
      if (!hasPrevious) {
        throw new NoSuchElementException
      }
      position -= 1
      menuComponents(position)
    }
  }
}

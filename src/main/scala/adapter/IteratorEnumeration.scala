package adapter

/**
  * Created by StarWix on 24.05.2016.
  */
class IteratorEnumeration[E](iterator: Iterator[E]) extends java.util.Enumeration[E] {
  override def hasMoreElements: Boolean = iterator.hasNext

  override def nextElement(): E = iterator.next()
}

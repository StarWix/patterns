package iterator

/**
  * Created by StarWix on 27.05.2016.
  */
trait Iterator[T] {
  def hasNext: Boolean
  def next: T
  def remove: Unit
  def hasPrevious: Boolean
  def previous: T
}

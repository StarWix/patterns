package observer.oop

/**
  * Created by starwix on 3.5.16.
  */
trait Observable {
  private val observers = scala.collection.mutable.ListBuffer[Observer]()
  def registerObserver(observer: Observer) = observers += observer
  def removeObserver(observer: Observer) = observers -= observer
  def notify(event: Any): Unit = observers foreach(_.updated(event))
}

package observer.oop

/**
  * Created by starwix on 3.5.16.
  */
case class LoggerObserver(id: Int, mouseEvent: Option[Mice] = None) extends Observer {
  override def updated(event: Any): Unit = event match {
    case mice: Mice =>
      println(s"Logger Observer $id")
      println(mice);
    case _ =>
  }

  mouseEvent map(_.registerObserver(this))
}

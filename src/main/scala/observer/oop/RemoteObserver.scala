package observer.oop

/**
  * Created by starwix on 3.5.16.
  */
case class RemoteObserver(id: Int, miceEvent: Option[Mice] = None) extends Observer {
  override def updated(event: Any): Unit = event match {
    case mice: Mice =>
      println(s"Remote Observer $id")
      println(mice);
    case _ =>
  }

  miceEvent map(_.registerObserver(this))
}

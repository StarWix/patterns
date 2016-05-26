package factory.abstr.notebooks

import factory.abstr.factories.ComponentFactory

/**
  * Created by StarWix on 27.05.2016.
  */
case class Ultrabook(componentFactory: ComponentFactory) extends AbstractNotebook {
  override def prepare: Unit = {
    println(
      s"""prepare
          |caseMaterial: ${componentFactory.caseMaterial}
          |cpu: ${componentFactory.cpu}""".stripMargin)
  }
}

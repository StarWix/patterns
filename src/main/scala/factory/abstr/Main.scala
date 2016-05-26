package factory.abstr

import factory.abstr.factories.{LenovoNotebookFactory, AsusNotebookFactory}

/**
  * Created by StarWix on 27.05.2016.
  */
object Main extends App {
  val asusNotebookFactory = new AsusNotebookFactory
  asusNotebookFactory.orderNotebook("Notebook")
  asusNotebookFactory.orderNotebook("Ultrabook")

  val lenoveNotebookFactory = new LenovoNotebookFactory
  lenoveNotebookFactory.orderNotebook("Notebook")
}

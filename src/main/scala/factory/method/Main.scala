package factory.method

/**
  * Created by StarWix on 26.05.2016.
  */
object Main extends App {
  val asusNotebookFactory = new AsusNotebookFactory
  asusNotebookFactory.orderNotebook("Ultrabook")
  asusNotebookFactory.orderNotebook("Notebook")

  val lenovoNotebookFactory = new LenovoNotebookFactory
  lenovoNotebookFactory.orderNotebook("Ultrabook")
}

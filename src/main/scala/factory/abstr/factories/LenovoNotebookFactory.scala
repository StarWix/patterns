package factory.abstr.factories

import factory.abstr.notebooks.{AbstractNotebook, Notebook, Ultrabook}

/**
  * Created by Стас on 27.05.2016.
  */
class LenovoNotebookFactory extends NotebookFactory {
  override def createNotebook(aType: String): AbstractNotebook = {
    val componentFactory = LenovoComponentFactory()
    aType match {
      case "Notebook" => Notebook(componentFactory)
      case "Ultrabook" => Ultrabook(componentFactory)
    }
  }
}

package factory.abstr.factories

import factory.abstr.notebooks.{Ultrabook, Notebook, AbstractNotebook}

/**
  * Created by Стас on 27.05.2016.
  */
class AsusNotebookFactory extends NotebookFactory {
  override def createNotebook(aType: String): AbstractNotebook = {
    val componentFactory = AsusComponentFactory()
    aType match {
      case "Notebook" => Notebook(componentFactory)
      case "Ultrabook" => Ultrabook(componentFactory)
    }
  }
}

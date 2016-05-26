package factory.method

import factory.method.notebooks.{LenovoUltrabook, LenovoNotebook}

/**
  * Created by StarWix on 26.05.2016.
  */
class LenovoNotebookFactory extends NotebookFactory {
  override def createNotebook(aType: String): Notebook = aType match {
    case "Notebook" => LenovoNotebook()
    case "Ultrabook" => LenovoUltrabook()
  }
}

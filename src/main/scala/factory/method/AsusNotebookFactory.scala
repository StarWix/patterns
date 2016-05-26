package factory.method

import factory.method.notebooks.{AsusUltrabook, AsusNotebook}

/**
  * Created by StarWix on 26.05.2016.
  */
class AsusNotebookFactory extends NotebookFactory {
  override def createNotebook(aType: String): Notebook = aType match {
    case "Notebook" => AsusNotebook()
    case "Ultrabook" => AsusUltrabook()
  }
}

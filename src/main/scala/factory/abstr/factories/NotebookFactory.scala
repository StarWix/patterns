package factory.abstr.factories

import factory.abstr.notebooks.AbstractNotebook

/**
  * Created by StarWix on 26.05.2016.
  */
trait NotebookFactory {
  def orderNotebook(aType: String): AbstractNotebook = {
    val notebook = createNotebook(aType)
    notebook.prepare
    notebook.test
    notebook.box
    notebook
  }

  def createNotebook(aType: String): AbstractNotebook
}

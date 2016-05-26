package factory.method

/**
  * Created by StarWix on 26.05.2016.
  */
trait NotebookFactory {
  def orderNotebook(aType: String): Notebook = {
    val notebook = createNotebook(aType)
    notebook.prepare
    notebook.test
    notebook.box
    notebook
  }

  def createNotebook(aType: String): Notebook
}

package factory.abstr.notebooks

/**
  * Created by StarWix on 27.05.2016.
  */
trait AbstractNotebook {
  def prepare: Unit
  def test: Unit = println(s"test ${this}")
  def box: Unit = println(s"box ${this}\n")
}

package factory.method

/**
  * Created by StarWix on 26.05.2016.
  */
trait Notebook {
  def caseMaterial: String
  def gpuType: String
  def color: String

  def prepare: Unit =
    println(
      s"""prepare
         |caseMaterial: $caseMaterial
         |gpuType: $gpuType
         |color: $color""".stripMargin)

  def test: Unit = println(s"test ${this}")

  def box: Unit = println(s"box ${this}\n")
}

package factory.method.notebooks

import factory.method.Notebook

/**
  * Created by StarWix on 26.05.2016.
  */
case class LenovoNotebook() extends Notebook {
  override def caseMaterial: String = "Plastic"
  override def gpuType: String = "Dedicated"
  override def color: String = "Black"
}

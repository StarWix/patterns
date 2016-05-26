package factory.method.notebooks

import factory.method.Notebook

/**
  * Created by StarWix on 26.05.2016.
  */
case class LenovoUltrabook() extends Notebook {
  override def caseMaterial: String = "Plastic"
  override def gpuType: String = "Integrated"
  override def cpu: String = "AMD"
}

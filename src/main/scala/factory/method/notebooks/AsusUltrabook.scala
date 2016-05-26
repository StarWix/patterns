package factory.method.notebooks

import factory.method.Notebook

/**
  * Created by StarWix on 26.05.2016.
  */
case class AsusUltrabook() extends Notebook {
  override def caseMaterial: String = "Aluminum"
  override def gpuType: String = "Integrated"
  override def cpu: String = "Intel"
}

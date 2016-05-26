package factory.method.notebooks

import factory.method.Notebook

/**
  * Created by StarWix on 26.05.2016.
  */
case class AsusNotebook() extends Notebook {
  override def caseMaterial: String = "Aluminum"
  override def gpuType: String = "Dedicated"
  override def cpu: String = "Intel"
}

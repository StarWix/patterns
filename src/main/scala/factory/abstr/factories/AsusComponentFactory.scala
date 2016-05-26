package factory.abstr.factories

import factory.abstr.components._

/**
  * Created by StarWix on 27.05.2016.
  */
case class AsusComponentFactory() extends ComponentFactory {
  override def caseMaterial: CaseMaterial = AluminumCaseMaterial()
  override def gpu = NvidiaGpu()
  override def cpu: Cpu = IntelCpu()
}

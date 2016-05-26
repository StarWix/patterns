package factory.abstr.factories

import factory.abstr.components._

/**
  * Created by StarWix on 27.05.2016.
  */
case class LenovoComponentFactory() extends ComponentFactory {
  override def caseMaterial: CaseMaterial = PlasticCaseMaterial()
  override def gpu = AmdGpu()
  override def cpu: Cpu = AmdCpu()
}

package factory.abstr.factories

import factory.abstr.components.{CaseMaterial, Cpu, Gpu}

/**
  * Created by StarWix on 27.05.2016.
  */
trait ComponentFactory {
  def caseMaterial: CaseMaterial
  def gpu: Gpu
  def cpu: Cpu
}

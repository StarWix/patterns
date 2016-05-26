package factory.abstr.components

/**
  * Created by StarWix on 27.05.2016.
  */
sealed trait Cpu
case class IntelCpu() extends Cpu
case class AmdCpu() extends Cpu
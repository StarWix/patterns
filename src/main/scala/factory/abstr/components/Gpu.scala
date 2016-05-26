package factory.abstr.components

/**
  * Created by StarWix on 27.05.2016.
  */
sealed trait Gpu
case class NvidiaGpu() extends Gpu
case class AmdGpu() extends Gpu

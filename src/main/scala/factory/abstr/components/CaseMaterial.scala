package factory.abstr.components

/**
  * Created by StarWix on 27.05.2016.
  */
sealed trait CaseMaterial
case class PlasticCaseMaterial() extends CaseMaterial
case class AluminumCaseMaterial() extends CaseMaterial

package template

/**
  * Created by StarWix on 27.05.2016.
  */
sealed trait Sauce
case class Oil() extends Sauce
case class Mayonnaise() extends Sauce


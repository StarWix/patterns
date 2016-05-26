package template

/**
  * Created by StarWix on 27.05.2016.
  */
sealed trait Ingredient
case class Beat() extends Ingredient
case class Cabbage() extends Ingredient
case class Potato() extends Ingredient
case class Cucumber() extends Ingredient
case class Onion() extends Ingredient
case class Apple() extends Ingredient
case class Cheese() extends Ingredient
case class Nut() extends Ingredient
case class Garlic() extends Ingredient

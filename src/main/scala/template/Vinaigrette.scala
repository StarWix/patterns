package template

/**
  * Created by StarWix on 27.05.2016.
  */
class Vinaigrette extends ReadySalad {
  override protected def addSauce: Sauce = Oil()
  override protected def cutIngredients: List[Ingredient] = List(Beat(), Cabbage(), Potato(), Cucumber(), Onion())
}

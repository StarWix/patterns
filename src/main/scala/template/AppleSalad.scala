package template

/**
  * Created by StarWix on 27.05.2016.
  */
class AppleSalad extends ReadySalad {
  override protected def addSauce: Sauce = Mayonnaise()
  override protected def cutIngredients: List[Ingredient] = List(Apple(), Cheese(), Nut(), Garlic())
}

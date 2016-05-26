package template

/**
  * Created by StarWix on 27.05.2016.
  */
trait ReadySalad {
  def create: SaladBox = {
    val ingredients = cutIngredients
    mix
    val sauce = addSauce
    box
    SaladBox(ingredients, sauce)
  }

  protected def cutIngredients: List[Ingredient]
  protected def mix: Unit = println("mix")
  protected def addSauce: Sauce
  protected def box: Unit = println("box")
}

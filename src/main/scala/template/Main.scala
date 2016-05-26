package template

/**
  * Created by StarWix on 27.05.2016.
  */
object Main extends App {
  val appleSalad = new AppleSalad().create
  println(appleSalad)

  val vinaigrette = new Vinaigrette().create
  println(vinaigrette)
}

package adapter

/**
  * Created by StarWix on 24.05.2016.
  */
object Main extends App {
  val vector = Vector(5, 10, 15)

  println(vector)

  val enumeration = new IteratorEnumeration(vector.iterator)

  var x: Int = 0
  while (enumeration.hasMoreElements) {
    println(enumeration.nextElement())
  }
}

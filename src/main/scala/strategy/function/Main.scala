package strategy.function

/**
  * Created by starwix on 2.5.16.
  */
object Main extends App {
  import Encryption._

  val encryptionService = EncryptionService(rsa)
  val encrypted = encryptionService.encrypt("Hello world")
  println(encrypted)
}

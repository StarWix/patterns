package strategy.oop

import strategy.oop.encryption.RsaEncryption

/**
  * Created by starwix on 2.5.16.
  */
object Main extends App {
  val encryptionService = EncryptionService(RsaEncryption())
  val encrypted = encryptionService.encrypt("Hello world")
  println(encrypted)
}

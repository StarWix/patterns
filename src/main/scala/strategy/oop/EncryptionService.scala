package strategy.oop

import strategy.oop.encryption.{BlowfishEncryption, Encryption}

/**
  * Created by starwix on 2.5.16.
  */
case class EncryptionService(encryption: Encryption = BlowfishEncryption()) {
  def encrypt(text: String): String = encryption.encrypt(text)
}

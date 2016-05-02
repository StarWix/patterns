package strategy

import strategy.encryption.Encryption

/**
  * Created by starwix on 2.5.16.
  */
class EncryptionService(val encryption: Encryption) {
  def encrypt(text: String): String = encryption.encrypt(text)
}

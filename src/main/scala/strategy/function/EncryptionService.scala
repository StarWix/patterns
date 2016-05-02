package strategy.function

/**
  * Created by starwix on 2.5.16.
  */
case class EncryptionService(encrypt: String => String = Encryption.blowfish)



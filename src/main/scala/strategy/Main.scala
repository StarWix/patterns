package strategy

import strategy.encryption.RsaEncryption

/**
  * Created by starwix on 2.5.16.
  */
object Main extends App {
  new EncryptionService(RsaEncryption()).encrypt("Hello world")
}

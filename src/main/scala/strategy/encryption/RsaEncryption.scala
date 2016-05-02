package strategy.encryption

/**
  * Created by starwix on 2.5.16.
  */
case class RsaEncryption() extends Encryption {
  override def encrypt(text: String): String = {
    println("RSA encryption")
    text
  }
}

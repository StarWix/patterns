package strategy.encryption

/**
  * Created by starwix on 2.5.16.
  */
case class ElGamalEncryption() extends Encryption {
  override def encrypt(text: String): String = {
    println("ElGamal encryption")
    text
  }
}

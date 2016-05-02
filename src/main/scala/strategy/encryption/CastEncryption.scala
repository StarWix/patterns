package strategy.encryption

/**
  * Created by starwix on 2.5.16.
  */
case class CastEncryption() extends Encryption {
  override def encrypt(text: String): String = {
    println("CAST encryption")
    text
  }
}

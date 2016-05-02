package strategy.encryption

/**
  * Created by starwix on 2.5.16.
  */
case class BlowfishEncryption() extends Encryption {
  override def encrypt(text: String): String = {
    println("Blowfish encryption")
    text
  }
}

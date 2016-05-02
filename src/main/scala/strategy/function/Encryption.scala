package strategy.function

/**
  * Created by starwix on 2.5.16.
  */
object Encryption {
  def rsa(text: String): String = {
    println("RSA encryption")
    text
  }

  def elGamal(text: String): String = {
    println("ElGamal encryption")
    text
  }

  def blowfish(text: String): String = {
    println("Blowfish encryption")
    text
  }

  def encrypt(text: String): String = {
    println("CAST encryption")
    text
  }
}

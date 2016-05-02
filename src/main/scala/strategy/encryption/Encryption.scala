package strategy.encryption

/**
  * Created by starwix on 2.5.16.
  */
trait Encryption {
  def encrypt(text: String): String
}

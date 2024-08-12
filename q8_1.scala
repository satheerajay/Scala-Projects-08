

object q8_1 {
  def main(args: Array[String]) = {
    val text = "Hello World!"
    val shift = 3

    val encryptedText = cipher(text, shift, "encrypt")
    val decryptedText = cipher(encryptedText, shift, "decrypt")

    println(s"Plaintext: $text")
    println(s"Encrypted: $encryptedText")
    println(s"Decrypted: $decryptedText")
  }

  def encryption(text: String, shift: Int): String = {
    text.map { character =>
      if (character.isLetter) {
        val base = if (character.isUpper) 'A' else 'a'
        ((character - base + shift) % 26 + base).toChar
      } else {
        character
      }
    }
  }

  def decryption(text: String, shift: Int): String = {
    text.map { character =>
      if (character.isLetter) {
        val base = if (character.isUpper) 'A' else 'a'
        ((character - base - shift) % 26 + base).toChar
      } else {
        character
      }
    }
  }

  def cipher(text: String, shift: Int, mode: String): String = {
    mode match {
      case "encrypt" => encryption(text, shift)
      case "decrypt" => decryption(text, shift)
    }
  }
}
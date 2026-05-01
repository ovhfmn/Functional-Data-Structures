package printable

object PrintableInstances {
  implicit val stringPrintable: Printable[String] = new Printable[String] {
    override def format(input: String): String = input
  }

  implicit val intPrintable: Printable[Int] = new Printable[Int] {
    override def format(input: Int): String = input.toString
  }

  implicit val catPrintable: Printable[Cat] = new Printable[Cat] {
    override def format(cat: Cat): String = {
      val name = Printable.format(cat.name)
      val age = Printable.format(cat.age)
      val colour = Printable.format(cat.colour)

      s"$name is a $age y.o. $colour cat."
    }
  }
  
}

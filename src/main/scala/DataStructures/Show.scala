package DataStructures

trait Show[A] {
  def show(value: A): String
}
object Show {
  def show[A](f: A => String): Show[A] = f(_)
}

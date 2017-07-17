import org.scalatest.{FlatSpec, Matchers}


class FraccionSpec extends FlatSpec with Matchers{

  "Fraccion " should " debe crear instancias correctamente" in {
    val a = new Fraccion(1, 2)
    val b = new Fraccion(1, 4)
    println(a + b)

  }

}

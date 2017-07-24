import org.scalatest.{FlatSpec, Matchers}


class FraccionSpec extends FlatSpec with Matchers{

  "Fraccion " should " debe crear instancias correctamente" in {
    val a = Fraccion(1, 2)
    val b = Fraccion(1, 4)
    println(a + b)

    (a + b ) shouldBe Fraccion(3,4)

  }

}

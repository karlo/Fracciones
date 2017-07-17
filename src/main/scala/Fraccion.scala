/**
  * Created by karlotadic on 7/17/17.
  */
class Fraccion(num:Int,denom:Int) {

  require(denom != 0, "Denominador no puede ser 0")

  private val maximoDivisor = mcd(num,denom)

  val numerador = num / maximoDivisor
  val denominador = denom / maximoDivisor

  def +(otra:Fraccion):Fraccion = {
    new Fraccion(numerador*otra.denominador + otra.numerador*denominador,denominador*otra.denominador)
  }

  private def mcd(a:Int, b:Int):Int = {
    if ( b == 0) a
    else mcd(b, a % b)
  }

  override def toString: String = s"${numerador}/${denominador}"
}



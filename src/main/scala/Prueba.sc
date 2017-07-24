import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global



println("Hello world")

val a = 10

def longExecution() = {
  Future {
    Thread.sleep(1000)
    10
  }
}

val response = longExecution()

List(1,2,3).par.map(i => i*2)
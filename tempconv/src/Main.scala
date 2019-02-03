package tempconv

import scala.util.{Try}

object TempConv {
  type Celsius = Float
  type Fahrenheit = Float
  def toFahrenheit(c: Celsius): Fahrenheit = c * 9 / 5 + 32
  def toCelsius(f: Fahrenheit): Celsius = (f - 32) * 5 / 9
}

object Main extends App {
  import TempConv._
  if (args.length < 1) {
    println("Usage: tempconv <number>")
  }
  for (arg <- args) Try(arg.toFloat).toOption match {
    case Some(t: Float) =>
      println(s"$t°F = ${toCelsius(t)}°C, $t°C = ${toFahrenheit(t)}°F")
    case None => println(s"Unable to parse $arg")
  }
}

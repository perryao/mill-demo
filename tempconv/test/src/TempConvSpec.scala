package tempconv

import org.scalatest.{ FlatSpec }
import tempconv.TempConv._

class TempConvSpec extends FlatSpec {
  it should "convert 32°F to 0°C" in {
    assert(toCelsius(32) == 0)
  }

  it should "convert 0°C to 32°F" in {
    assert(toFahrenheit(0) == 32)
  }
}

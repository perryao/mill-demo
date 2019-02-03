import mill._, scalalib._, scalafmt._

object helloworld extends ScalaModule with ScalafmtModule {
  def scalaVersion = "2.12.6"
}

object tempconv extends ScalaModule with ScalafmtModule {
  def scalaVersion = "2.12.6"
  def mainClass = Some("tempconv.Main")
  object test extends Tests {
    def ivyDeps = Agg(
      ivy"org.scalatest::scalatest:3.0.5",
    )
    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }
}

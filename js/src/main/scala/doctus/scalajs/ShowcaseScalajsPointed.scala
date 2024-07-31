package doctus.scalajs

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.dom
import doctus.core.DoctusControllerPointable

@JSExportTopLevel("PointedMap")
object ShowcaseScalajsPointed {

  @JSExport
  def main(): Unit = {
    // Get elements from html page
    val canvasElem: dom.HTMLCanvasElement = dom.document.getElementById("canvas").asInstanceOf[dom.HTMLCanvasElement]
    // Wrap elements with doctus implementations
    val canvas = DoctusCanvasScalajs(canvasElem)
    val point = DoctusPointableScalajs(canvasElem)
    // Call the controller
    DoctusControllerPointable(point, canvas)
  }
}


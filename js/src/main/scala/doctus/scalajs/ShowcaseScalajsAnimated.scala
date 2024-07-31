package doctus.scalajs

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.dom
import doctus.core.DoctusControllerAnimated

@JSExportTopLevel("AnimatedMap")
object ShowcaseScalajsAnimated {

  @JSExport
  def main(): Unit = {
    // Get element from html page
    val canvasElem: dom.HTMLCanvasElement = dom.document.getElementById("canvas").asInstanceOf[dom.HTMLCanvasElement]
    // Create doctus wrappers
    val sched = DoctusSchedulerScalajs
    val canvas = DoctusCanvasScalajs(canvasElem)
    val logo = DoctusImageScalajs("src/main/resources/logo.png")
    // call the controller
    DoctusControllerAnimated(canvas, sched, logo)
  }
}


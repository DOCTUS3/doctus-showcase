package doctus.scalajs

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import org.scalajs.dom
import doctus.core.DoctusControllerSchedulerStop

@JSExportTopLevel("SchedulerStopMap")
object ShowcaseScalajsSchedulerStop {

  @JSExport
  def main(): Unit = {

    // Get elements from html
    val canvasElem: dom.HTMLCanvasElement = dom.document.getElementById("canvas").asInstanceOf[dom.HTMLCanvasElement]
    val startElem: dom.HTMLElement = dom.document.getElementById("start").asInstanceOf[dom.HTMLElement]
    val stopElem: dom.HTMLElement = dom.document.getElementById("stop").asInstanceOf[dom.HTMLElement]

    // Apply doctus wrappers
    val sched = DoctusSchedulerScalajs
    val start = DoctusActivatableScalajs(startElem)
    val stop = DoctusActivatableScalajs(stopElem)
    val canv = DoctusCanvasScalajs(canvasElem)

    // Call the controller
    DoctusControllerSchedulerStop(sched, start, stop, canv)
  }
}

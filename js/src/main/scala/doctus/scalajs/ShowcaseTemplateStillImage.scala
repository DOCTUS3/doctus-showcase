package doctus.scalajs

import doctus.core.DoctusTemplateStillImage
import doctus.core.template.DoctusTemplateController
import org.scalajs.dom

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("StillImage")
object ShowcaseTemplateStillImage {

  @JSExport
  def main(): Unit = {

    // Get element from html page
    val canvasElem: dom.HTMLCanvasElement = dom.document.getElementById("canvas").asInstanceOf[dom.HTMLCanvasElement]

    // Create doctus wrappers
    val templCanvas = DoctusTemplateCanvasScalajs(canvasElem)
    val sched = DoctusSchedulerScalajs

    // call the controller
    val templ = DoctusTemplateStillImage(templCanvas)
    DoctusTemplateController(templ, sched, templCanvas)
  }

}
package doctus.scalajs

import doctus.core.DoctusTemplateKeys
import doctus.core.template.DoctusTemplateController
import org.scalajs.dom

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}


@JSExportTopLevel("ShowcaseTemplateKeys")
object ShowcaseTemplateKeysScalajs {
  
  @JSExport
  def main(): Unit = {

    // Get element from html page
    val canvasElem: dom.HTMLCanvasElement = dom.document.getElementById("canvas").asInstanceOf[dom.HTMLCanvasElement]

    // Create doctus wrappers
    val templCanvas = DoctusTemplateCanvasScalajs(canvasElem)
    val sched = DoctusSchedulerScalajs

    // Instantiate the template and put it to the controller
    val templ = DoctusTemplateKeys(templCanvas)
    DoctusTemplateController(templ, sched, templCanvas)
  }
}


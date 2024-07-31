package doctus.scalajs

import doctus.core._
import org.scalajs.dom
import org.querki.jquery._

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("ComponentMap")
object ShowcaseScalajsComponent {

  @JSExport
  def main(): Unit = {
    val infoElem: dom.HTMLElement = dom.document.getElementById("info").asInstanceOf[dom.HTMLElement]
    val activatable01Elem: dom.HTMLElement = dom.document.getElementById("activatable_01").asInstanceOf[dom.HTMLElement]
    val activatable02Elem: dom.HTMLElement = dom.document.getElementById("activatable_02").asInstanceOf[dom.HTMLElement]
    val button01Elem: dom.HTMLElement = dom.document.getElementById("button_01").asInstanceOf[dom.HTMLElement]
    val select01Elem: dom.HTMLElement = dom.document.getElementById("select_01").asInstanceOf[dom.HTMLElement]
    val selectButton01Elem: dom.HTMLElement = dom.document.getElementById("button_select_01").asInstanceOf[dom.HTMLElement]
    
    DoctusControllerComponent(
      DoctusPointableScalajs(activatable01Elem),
      DoctusPointableScalajs(activatable02Elem),
      DoctusKeyScalajs(dom.document.body),
      DoctusActivatableScalajs(button01Elem),
      DoctusSelectScalajs[FullName](JQueryStatic(select01Elem), fn => s"${fn.first} -- ${fn.last}"),
      DoctusActivatableScalajs(selectButton01Elem),
      DoctusTextScalajs(infoElem))
  }

}


package doctus.swing

import doctus.core.DoctusTemplateKeys
import doctus.core.template.DoctusTemplateController

import java.awt.{BorderLayout, Dimension}
import javax.swing.{ImageIcon, JFrame, WindowConstants}
import java.net.URL

object ShowcaseTemplateSwingKeys extends App {

  val p = DoctusSwingComponentFactory.component
  val canvas: DoctusTemplateCanvasSwing = DoctusTemplateCanvasSwing(p)
  val sched = DoctusSchedulerSwing
  val logo: DoctusImageSwing = DoctusImageSwing("logo.png")

  val top = new JFrame()
  top.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
  top.setTitle("Canvas Showcase")
  val url: URL = getClass.getClassLoader.getResource("logo.png")
  if (url != null) top.setIconImage(new ImageIcon(url).getImage)

  top.getContentPane.add(p, BorderLayout.CENTER)
  top.setSize(new Dimension(900, 700))
  top.setVisible(true)

  val templ: DoctusTemplateKeys = DoctusTemplateKeys(canvas)
  DoctusTemplateController(templ, sched, canvas)

}

package doctus.swing

import doctus.core.DoctusTemplateStillImage
import doctus.core.template._

import java.awt.{BorderLayout, Dimension}
import javax.swing.{ImageIcon, JFrame, WindowConstants}
import java.net.URL

object ShowcaseTemplateSwingStillImage extends App {

  val p = DoctusSwingComponentFactory.component
  val canvas: DoctusTemplateCanvasSwing = DoctusTemplateCanvasSwing(p)
  val sched = DoctusSchedulerSwing

  val top = new JFrame()
  top.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
  top.setTitle("Canvas Showcase")
  val url: URL = getClass.getClassLoader.getResource("logo.png")
  if (url != null) top.setIconImage(new ImageIcon(url).getImage)

  top.getContentPane.add(p, BorderLayout.CENTER)
  top.setSize(new Dimension(900, 700))
  top.setVisible(true)

  val templ: DoctusTemplateStillImage = DoctusTemplateStillImage(canvas)
  DoctusTemplateController(templ, sched, canvas)

}

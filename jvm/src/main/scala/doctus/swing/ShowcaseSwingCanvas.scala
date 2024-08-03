package doctus.swing

import doctus.core._

import java.awt.{BorderLayout, Dimension}
import javax.swing._
import java.net.URL

object ShowcaseSwingCanvas extends App {

  val p = DoctusSwingComponentFactory.component
  val canvas: DoctusCanvasSwing = DoctusCanvasSwing(p)
  val logo: DoctusImageSwing = DoctusImageSwing("logo.png")

  DoctusControllerCanvas(canvas, logo)

  val top = new JFrame()
  top.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
  top.setTitle("Canvas Showcase")
  val url: URL = getClass.getClassLoader.getResource("logo.png")
  if (url != null) top.setIconImage(new ImageIcon(url).getImage)

  top.getContentPane.add(p, BorderLayout.CENTER)
  top.setSize(new Dimension(900, 700))
  top.setVisible(true)
}

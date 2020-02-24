import java.applet.Applet;
// import java.awt.Graphics;
import java.awt.*;

public class DrawApplet extends Applet {

	public void paint(Graphics g) {
		g.drawRect(130,10,200,150);
		g.drawOval(10,10,100,100);
		g.drawLine(10,200,100,200);
	}
}

/*
<applet code = "DrawApplet.class" width = "500" height = "500">
</applet>
*/

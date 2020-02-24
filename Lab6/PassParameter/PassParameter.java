import java.awt.*;
import java.applet.*;

/*
<applet code="PassParameter.class" width="400" height="200">
<param name="Name" value="Bigyan">
<param name="Sport" value="Cricket">
</applet>
*/

public class PassParameter extends Applet 
{
	String name;
	String sport;

	public void init(){
		name = getParameter("Name");
		sport = getParameter("Sport");
	}

	public void paint(Graphics g){
		g.drawString("Name -" + name, 20, 20);
		g.drawString("Favorite sport -" + sport, 20, 60);
	}
}
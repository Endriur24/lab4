package lab3;
import java.awt.Graphics;
import java.util.Timer;
import javax.swing.JApplet;
public class SpringApplet extends JApplet {
	private SimEngine simEngine;
	private SimTask simTask;
	private Timer Timer;
	public void init() {
			setSize(900,600);
			simEngine = new SimEngine(15, 5, 0.9, 150, new Vector2D(0,100),
			new Vector2D(0,-50), new Vector2D(0,100));
			simTask = new SimTask(0.1,this,simEngine);
			Timer = new Timer();
			Timer.scheduleAtFixedRate(simTask, 0, 10);
	}
public void paint(Graphics gd) {
	gd.clearRect(0, 0, getWidth(), getHeight()); //wyczyszczenie okna
	gd.translate(900/2, 600/2);
	int xo = (int)simEngine.getPunktZawieszenia().x;
	int yo = -(int)simEngine.getPunktZawieszenia().y;
	gd.translate(xo, yo);
	gd.drawLine(0, 0, (int)simEngine.getPolozenie().x, -(int)simEngine.getPolozenie().y); //rysowanie linii - sprezyna
	gd.fillOval((int)simEngine.getPolozenie().x - 10, -(int)simEngine.getPolozenie().y, 20, 20); //rysowanie kola - mase
}
}



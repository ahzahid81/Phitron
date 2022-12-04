import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width= getWidth();
        int height=  getHeight();


        int x= width/15;
        int y= height/15;

        int i;

        // number two task
        for(i=0;i<15;i++) {
            g.drawLine(0,0, (x*i), height-(y*i));
            g.drawLine(0,height, x*i, y*i);
            g.drawLine(width, 0, width-(x*i), height-(y*i));
            g.drawLine(width, height, x*i, height-(y*i));
        }

        // g.drawLine(0,0,width, height);
        // g.drawLine(0, height, width, 0);
    }
}
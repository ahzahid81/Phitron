import javax.swing.JFrame;
public class DrawPanelTest {
    public static void main(String[] args) {
        DrawPanel d= new DrawPanel();

        JFrame  f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(d);
        f.setSize(250,250);
        f.setVisible(true);
    }
}

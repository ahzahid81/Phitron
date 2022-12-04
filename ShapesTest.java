import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {
    public static void main(String[] args) {

        String input= JOptionPane.showInputDialog(null, "Enter 1 to draw Rectangles or 2 for Ovals");
        int choice= Integer.parseInt(input);

        Shapes n= new Shapes(choice);
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(n);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

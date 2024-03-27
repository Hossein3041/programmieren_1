package selbstlernprojekt;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import selbstlernprojekt.HeartShapePanel;

public class HeartShapeDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HeartShapePanel heartShapePanel = new HeartShapePanel();
            heartShapePanel.setBackground(Color.WHITE);

            JFrame frame = new JFrame("Heart shape in Swing/Java 2D");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.add(heartShapePanel);
            frame.setLocationRelativeTo(null);  // centers on screen
            frame.setVisible(true);
        });
    }
}
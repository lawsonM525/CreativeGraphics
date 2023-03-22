import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{

    Image image;
    
    MyPanel(){

        image = new ImageIcon("woman.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g){//invoked automatically when JFrame is instantiated
        
        Graphics2D g2D = (Graphics2D) g;//cast g to Graphics2D

        g2D.setStroke(new BasicStroke(5));

        g2D.setFont(new Font("Ink Free", Font.BOLD, 20));

    }
}

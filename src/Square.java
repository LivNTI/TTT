import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Square extends JPanel implements MouseListener {
    final int SIZE = 100;
    Color c1 = Color.red;
    Color c2 = Color.magenta;
    Window myWindow;


    public Square(Window win) {
        myWindow = win;
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setBackground(Color.green);
        addMouseListener(this);
        this.setSize(new Dimension(SIZE, SIZE));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        repaint();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("CLICK!");
        System.out.println(e.getButton());
        if (e.getButton() == 1) {


            if (myWindow.isRed()) {
                this.setBackground(c1);
            } else {
                this.setBackground(c2);
            }
            myWindow.changeRed();
        } else {
            this.setBackground(Color.blue);
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

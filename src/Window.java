import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private boolean red = false;


    public Window() {
        this.setTitle("click me");
        final int SIZE = 200;
        this.setPreferredSize(new Dimension(SIZE, SIZE));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Layout manager
        JPanel multiPanel = new JPanel();
        GridLayout layout = new GridLayout(3, 2);
        multiPanel.setLayout(layout);

        //add squares
        multiPanel.add(new Square(this));
        multiPanel.add(new Square(this));
        multiPanel.add(new Square(this));
        multiPanel.add(new Square(this));
        multiPanel.add(new Square(this));
        multiPanel.add(new Square(this));

        //finish up
        this.getContentPane().add(multiPanel);
        this.pack();
        this.setVisible(true);
    }

    //GET/SET

    public boolean isRed() {
        return red;
    }

    public void changeRed() {
        this.red = !this.red;
    }
}

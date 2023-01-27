package base;

import javax.swing.JFrame;
import base.model.Fase;

public class Container extends JFrame {

    public Container() {
        add(new Fase());
        setTitle("Space Defender");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(true);
        setVisible(true);
    }

}
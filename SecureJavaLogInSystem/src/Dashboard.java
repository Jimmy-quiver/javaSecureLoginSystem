import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dashboard extends JFrame{
    Font font;
    Font inputFont;

    Color primaryColor;

    JPanel sideMenu;

    JFrame dashboard;

    Dashboard(){
        // side panel
        sideMenu= new JPanel();
        sideMenu.setLayout(new BoxLayout(sideMenu, BoxLayout.Y_AXIS));
        sideMenu.setPreferredSize(new Dimension(200, this.getHeight()));
        sideMenu.setBackground(primaryColor);

        // dashboard frame
        dashboard = new JFrame("Dashboard");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750, 750);
        this.setLayout(new BorderLayout());
        this.add(sideMenu, BorderLayout.WEST);
        this.setVisible(true);

    }
}

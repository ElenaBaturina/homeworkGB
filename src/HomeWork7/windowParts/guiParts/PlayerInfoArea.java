package HomeWork7.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class PlayerInfoArea extends JPanel {

    private String heroHP = " HP => ";
    private String heroStr = " STR => ";
    private String heroPosition = " Position => ";

    private JLabel hp;
    private JLabel str;
    private JLabel position;


    public PlayerInfoArea() {
        setBackground(new Color(108, 105, 233));
        setLayout(new GridLayout(4, 1));

        hp = new JLabel(heroHP + "-", SwingConstants.LEFT);
        str = new JLabel(heroStr + "-", SwingConstants.LEFT);
        position = new JLabel(heroPosition + "-", SwingConstants.LEFT);

        add(new JLabel("=> Player info <=", SwingConstants.CENTER));
        add(hp);
        add(str);
        add(position);

    }

//    public void refreshPlayerInfo(Player player) {
//        hp.setText(heroHP + player.getHealth());
//        position.setText(heroPosition + player.getPosition());
//    }

}

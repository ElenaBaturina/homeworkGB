package HomeWork7.windowParts.guiParts;

import HomeWork7.windowParts.GuiPanel;
import HomeWork7.windowParts.GameMap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerControlArea extends JPanel {

    private GuiPanel guiPanel;

    private JButton moveUpPlayer;
    private JButton moveDownPlayer;
    private JButton moveLeftPlayer;
    private JButton moveRightPlayer;


    public PlayerControlArea(GuiPanel guiPanel) {
       this.guiPanel = guiPanel;

       setLayout(new GridLayout(3, 3));

        moveUpPlayer = new JButton("\uD83E\uDC45");
//        moveUpPlayer.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_UP);
//            }
//        });


        moveDownPlayer = new JButton("\uD83E\uDC44");
//        moveDownPlayer.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_DOWN);
//            }
//        });

        moveRightPlayer = new JButton("\uD83E\uDC46");
//        moveRightPlayer.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_RIGHT);
//            }
//        });

        moveLeftPlayer = new JButton("\uD83E\uDC47");
//        moveLeftPlayer.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                guiPanel.changePositionPlayer(GameMap.DIRECTION_MOVE_LEFT);
//            }
//        });


        add(new JPanel());
        add(moveUpPlayer);
        add(new JPanel());
        add(moveDownPlayer);
        add(new JPanel());
        add(moveRightPlayer);
        add(new JPanel());
        add(moveLeftPlayer);
        add(new JPanel());

    }



}

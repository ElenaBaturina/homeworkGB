package HomeWork7.windowParts;

import HomeWork7.MainWindow;
import HomeWork7.windowParts.guiParts.GameControlArea;
import HomeWork7.windowParts.guiParts.GameInfoArea;
import HomeWork7.windowParts.guiParts.PlayerControlArea;
import HomeWork7.windowParts.guiParts.PlayerInfoArea;

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JPanel {

    private MainWindow mainWindow;

    private GameControlArea gameControlArea;
    private PlayerInfoArea playerInfoArea;
    private GameInfoArea gameInfoArea;
    private PlayerControlArea playerControlArea;

    private JTextArea gameLog;
    private JScrollPane scrollLog;


    public GuiPanel(MainWindow mainWindow){
        this.mainWindow = mainWindow;

       prepare();
       createParts();
       prepareLogArea();

       add(gameControlArea);
       add(gameInfoArea);
       add(playerInfoArea);
       add(playerControlArea);

       add(scrollLog);



    }

    public void prepare() {
            setBackground(new Color(73, 69, 228));
            setLayout(new GridLayout(5, 1));
        }

    public void prepareLogArea(){
        gameLog = new JTextArea("Game Log");
        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
        scrollLog = new JScrollPane(gameLog);

        }

    public void createParts() {
        gameControlArea = new GameControlArea(/*this*/);
        gameInfoArea = new GameInfoArea();
        playerControlArea = new PlayerControlArea(this);
        playerInfoArea = new PlayerInfoArea();

    }

//    public void recordLog(String msg) {
//        gameLog.append(msg + "\n");
//    }
//
//    public void launchNewGame() {
//        mainWindow.startNewGame();
//    }
//
//    public void refreshGuiInfo(GameMap map) {
//        playerInfoArea.refreshPlayerInfo(map.getPlayer());
//        gameInfoArea.refreshGameInfo(map.getCountEnemies(), map.getLevelCount(), map.getMapSize());
//    }
//
//    public void changePositionPlayer(int key) {
//        mainWindow.changePositionPlayer(key);
//    }



}

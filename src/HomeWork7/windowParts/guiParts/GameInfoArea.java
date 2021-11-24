package HomeWork7.windowParts.guiParts;

import javax.swing.*;
import java.awt.*;

public class GameInfoArea extends JPanel {

        private String countEnemyTitle = " Count enemy => ";
        private String levelTitle = " Level => ";
        private String sizeMapTitle = " Size map => ";

        private JLabel countEnemy;
        private JLabel levelGame;
        private JLabel sizeMap;


        public GameInfoArea() {
                setBackground(new Color(108, 105, 233));
                setLayout(new GridLayout(4, 1));

                countEnemy = new JLabel(countEnemyTitle + "-"/*, SwingConstants.LEFT*/);
                levelGame = new JLabel(levelTitle + "-"/*,SwingConstants.LEFT*/);
                sizeMap = new JLabel(sizeMapTitle + "-:-"/*, SwingConstants.LEFT*/);


                add(new JLabel("=> Game info <=", SwingConstants.CENTER));
                add(countEnemy);
                add(levelGame);
                add(sizeMap);

        }

        public void refreshGameInfo(int countInfo, int level, String sizeMapInfo) {
                countEnemy.setText(countEnemyTitle + countInfo);
                levelGame.setText(levelTitle + level);
                sizeMap.setText(sizeMapTitle + sizeMapInfo);
        }


}

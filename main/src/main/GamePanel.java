package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    // SCREEN SETTINGS
    final int originalTileSize = 16; // 16x16 tile
    // But a 16x16 character would look tiny on a modern screen
    final int scale = 3;
    final int tileSize = originalTileSize * scale; // 16x3 = 48x48 pixel characters
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    // 16 tiles to x-axis (Probably)
    // 12 tiles to the y-axis (Probably)
    final int screenWidth = tileSize * maxScreenCol; // 768
    final int screenHeight = tileSize * maxScreenRow; // 576

    Thread gameThread;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run(){



    }

}

package Core;


import Display.Display;
import States.*;
import gfx.Assets;
import gfx.HighScoreLoader;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputHandler implements KeyListener{

    public InputHandler(Display display) {
        display.getCanvas().addKeyListener(this);
        display.getCanvas().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(StateManager.getCurrentState());
                if (StateManager.getCurrentState().toString().contains("MainMenuState")){
                    StateManager.setCurrentState(new GameState() {
                    });}
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
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_RIGHT){
            GameState.player.isMovingRight = true;
        }else if (keyCode == KeyEvent.VK_LEFT){
            GameState.player.isMovingLeft = true;
        }

        if (StateManager.getCurrentState() instanceof GameOverState) {

            if (keyCode>='A' && keyCode<='Z' && GameOverState.input.length()< 14) {
                GameOverState.input.append((char) keyCode);
            } else if (keyCode == KeyEvent.VK_BACK_SPACE && GameOverState.input.length()>0) {
                GameOverState.input.deleteCharAt(GameOverState.input.length()-1);
            } else if (keyCode == KeyEvent.VK_SPACE){
                GameOverState.input.append(" ");
            } else if (keyCode == KeyEvent.VK_ENTER && GameOverState.input.length() > 0) {
                GameState.player.setName(GameOverState.input.toString());
                GameOverState.input.setLength(0);
                HighScoreLoader.savingHighScores(GameState.player.getName(), GameState.player.getPointsCollected());
                StateManager.setCurrentState(new ScoreState());
            }
        }

        if (StateManager.getCurrentState() instanceof ScoreState){
            if (keyCode == KeyEvent.VK_SPACE){
                StateManager.setCurrentState(new MainMenuState());
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_RIGHT){
            GameState.player.isMovingRight = false;
        }else if (keyCode == KeyEvent.VK_LEFT){
            GameState.player.isMovingLeft = false;
        }
    }
}

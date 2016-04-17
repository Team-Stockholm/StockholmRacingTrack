package Core;


import Display.Display;
import States.GameState;
import States.State;
import States.StateManager;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener{

    public InputHandler(Display display) {
        display.getCanvas().addKeyListener(this);

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
        }else if (keyCode == KeyEvent.VK_SPACE) {
            if (StateManager.getCurrentState().toString().contains("MainMenuState")) {
                StateManager.setCurrentState(new GameState());
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

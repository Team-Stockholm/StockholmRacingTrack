package Core;


import Display.Display;
import States.GameState;
import States.MainMenuState;
import States.State;
import States.StateManager;

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
//        Loading a new GameState with pressing space - starting game.
//        else if (keyCode==KeyEvent.VK_SPACE) {
//            if (StateManager.getCurrentState().toString().contains("MainMenuState")){
//                StateManager.setCurrentState(new GameState() {
//                });}
//        }
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

package events;

import Display.Display;
import States.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput {

    public MouseInput(Display display) {
        display.getCanvas().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(StateManager.getCurrentState());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                if(StateManager.getCurrentState() instanceof MainMenuState){
                    if (MainMenuState.newGameButton.getColliderBox().contains(mouseX, mouseY)) {
                        StateManager.setCurrentState(new GameState());
                    }
                    if (MainMenuState.bestButton.getColliderBox().contains(mouseX, mouseY)) {
                        StateManager.setCurrentState(new ScoreState());
                    }
                    if (MainMenuState.exitButton.getColliderBox().contains(mouseX, mouseY)) {
                        System.exit(0);
                    }
                }
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
}

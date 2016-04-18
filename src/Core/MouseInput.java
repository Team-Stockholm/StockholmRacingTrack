package Core;

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
                if (StateManager.getCurrentState().toString().contains("MainMenuState")) {
                    StateManager.setCurrentState(new GameState());
                }
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
}

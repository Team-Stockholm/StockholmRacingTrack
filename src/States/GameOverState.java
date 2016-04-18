package States;

import gfx.Assets;

import java.awt.*;

public class GameOverState extends State {
    public static StringBuilder input = new StringBuilder();

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.gameOverBackground, 0, 0, null);

        graphics.setFont(new Font("HELEN BG THIN ITALIC_0", Font.PLAIN, 30));
        graphics.setColor(Color.white);
        graphics.drawRect(260, 460, 300, 40);
        graphics.drawString(input.toString(), 270, 490);
    }
}

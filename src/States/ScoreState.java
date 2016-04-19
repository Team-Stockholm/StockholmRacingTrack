package States;


import gfx.Assets;
import gfx.HighScoreLoader;

import java.awt.*;
import java.util.Map;

public class ScoreState extends State{
    public ScoreState(){
        HighScoreLoader.loadingHighScores();
    }

    @Override
    public void update() {

    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawImage(Assets.scoreBackground, 0, 0, null);

        graphics.setFont(new Font("HELEN BG THIN ITALIC_0", Font.PLAIN, 30));
        graphics.setColor(Color.white);

        graphics.drawString("Name",130, 300);
        graphics.drawString("Score", 600, 300);

        int counter = 1;
        int position = 330;

        graphics.setFont(new Font("HELEN BG THIN ITALIC_0", Font.ITALIC, 20));
        for(Map.Entry<String, Integer> entry : HighScoreLoader.highScores.entrySet())
        {
            graphics.drawString(counter + "." + entry.getKey(), 130, position);
            graphics.drawString(String.format("%d", entry.getValue()), 600, position);

            position += 35;
            counter++;

            if (counter > 8 ){
                break;
            }
        }
    }
}

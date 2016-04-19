package States;


import Interfaces.Drawable;
import Interfaces.Updatable;

import java.awt.*;

public abstract class State implements Updatable, Drawable {
    public abstract void update();

    public abstract void render(Graphics graphics);
}

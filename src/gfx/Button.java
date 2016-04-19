package gfx;

import java.awt.*;

public class Button {
    public String name;
    private Rectangle colliderBox;

    public Button(int x, int y) {
        colliderBox = new Rectangle(x, y, 180, 30);
    }

    public Rectangle getColliderBox() {
        return colliderBox;
    }

    public void setColliderBox(Rectangle colliderBox) {
        this.colliderBox = colliderBox;
    }
}

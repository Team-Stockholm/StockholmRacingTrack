package Interfaces;

import org.w3c.dom.css.Rect;

import java.awt.*;

public interface Collidable {
    Rectangle getColliderBox();
    void setColliderBox(Rectangle colliderBox);
}

package com.main;

import java.awt.*;

public class Player extends GameObject{
    public Player(int x, int y, ID id) {
        super(x, y, id);
    }
    public void tick() {
        this.x += this.velX;
        this.y += this.velY;
    }

    public void render(Graphics g) {
        if (id == ID.Player){
            g.setColor(Color.white);
        }else if (id == ID.Player2){
            g.setColor(Color.blue);
        }

        g.fillRect(x, y, 32, 32);

    }
}

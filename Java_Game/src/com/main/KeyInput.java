package com.main;

import java.awt.event.*;

public class KeyInput extends KeyAdapter {
    private Handler handler;
    private boolean U = false;
    private boolean D = false;
    private boolean L = false;
    private boolean R = false;
    public KeyInput(Handler handler) {
        this.handler = handler;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        for (GameObject i : handler.object){
            if (i.getId() == ID.Player){
                if (key == KeyEvent.VK_UP){
                    U = true;
                    i.setVelY(-10);
                }
                if (key == KeyEvent.VK_DOWN){
                    D = true;
                    i.setVelY(10);
                }
                if (key == KeyEvent.VK_RIGHT){
                    R = true;
                    i.setVelX(10);
                }
                if (key == KeyEvent.VK_LEFT){
                    L = true;
                    i.setVelX(-10);
                }
            }
        }
    }
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for (GameObject i : handler.object){
            if (i.getId() == ID.Player){
                if (key == KeyEvent.VK_UP){
                    U = false;
                    if (D){
                        i.setVelY(10);
                    }else{
                        i.setVelY(0);
                    }
                }
                if (key == KeyEvent.VK_DOWN){
                    D = false;
                    if (U){
                        i.setVelY(-10);
                    }else{
                        i.setVelY(0);
                    }
                }
                if (key == KeyEvent.VK_RIGHT){
                    R = false;
                    if (L){
                        i.setVelX(-10);
                    }else{
                        i.setVelX(0);
                    }
                }
                if (key == KeyEvent.VK_LEFT){
                    L = false;
                    if (R){
                        i.setVelX(10);
                    }else{
                        i.setVelX(0);
                    }
                }
            }
        }
    }
}

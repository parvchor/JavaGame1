package java_game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Handler;


public class KeyInput extends KeyAdapter{


    private handler Handler;


    public void  keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        System.out.println(key);

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if(tempObject.getID() == ID.Player){

                if(key == KeyEvent.VK_W) tempObject.setY(tempObject.getY()-5);

            }

        }

    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

    }
}

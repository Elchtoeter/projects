import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        int key = e.getKeyCode();
        for (GameObject object : handler.object) {
            if (object.getId() == ID.Player){
                if (key == KeyEvent.VK_W){object.setAccN(true);}
                if (key == KeyEvent.VK_S){object.setAccS(true);}
                if (key == KeyEvent.VK_D){object.setAccE(true);}
                if (key == KeyEvent.VK_A){object.setAccW(true);}
            }
        }
        if (key == KeyEvent.VK_ESCAPE)
            System.exit(1);
    }


    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
        int key = e.getKeyCode();
        for (GameObject object : handler.object) {
            if (object.getId() == ID.Player){
                if (key == KeyEvent.VK_W){object.setAccN(false);}
                if (key == KeyEvent.VK_S){object.setAccS(false);}
                if (key == KeyEvent.VK_D){object.setAccE(false);}
                if (key == KeyEvent.VK_A){object.setAccW(false);}
            }
        }
    }
}

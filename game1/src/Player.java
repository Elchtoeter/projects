import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, ID id) {
        super(x, y, id);

    }


    public void tick() {
        x += velX;
        y += velY;
        if(x > 640 - 32 || x < 0){
            velX = 0;
            x = 0;
        }
        if(y > (480 - 32) || y < 0){
            velY = 0;
        }
    }


    public void render(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(x,y, 32 ,32);
    }


}

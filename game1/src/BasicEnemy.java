import java.awt.*;

public class BasicEnemy extends GameObject {


    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);
        velX = 5;
        velY = 5;
    }

    public void tick() {
        x += velX;
        y += velY;
        if(x >= Game.WIDTH - 32 || x <= 0){
            velX = -velX;
        }
        if(y >= Game.HEIGHT - 32 || y <= 0){
            velY = -velY;
        }
    }


    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x,y, 16 ,16);
    }
}

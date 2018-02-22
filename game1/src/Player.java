import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, ID id) {
        super(x, y, id);

    }


    public void tick() {
        if (accN){velY+=-5;}
        if (accS){velY+=5;}
        if (accW){velX+=-5;}
        if (accE){velX+=5;}
        x += velX;
        y += velY;
        x = Game.clamp(x,0,Game.WIDTH - 42);
        y = Game.clamp(y,0, Game.HEIGHT - 65);
        velY = 0;
        velX = 0;
    }


    public void render(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(x,y, 32 ,32);
    }


}

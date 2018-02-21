import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, ID id) {
        super(x, y, id);

    }


    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x,0,Game.WIDTH - 42);
        y = Game.clamp(y,0, Game.HEIGHT - 65);
    }


    public void render(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(x,y, 32 ,32);
    }


}

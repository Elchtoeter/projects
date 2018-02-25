import java.awt.*;

public class Player extends GameObject {

    private int health;
    private boolean hit;
    private int hitTimer;
    private int tempTimer;

    public Player(int x, int y, ID id) {
        super(x, y, id);
        health = 100;
        hitTimer = 300;
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
        if (hit && tempTimer <= hitTimer) {
            tempTimer--;
            if (tempTimer <= 0){
                hit = false;
                tempTimer = hitTimer;
            }
        }
    }


    public void render(Graphics g) {
        g.setColor(Color.CYAN);
        if (hit){
            g.setColor(Color.RED);
        }
        g.fillRect(x,y, 32 ,32);
    }

    public void setHealth(int change){
        health += change;
    }

    public int getHealth() {
        return health;
    }

    public boolean isHit() {
        return hit;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }
}

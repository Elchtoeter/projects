
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Handler {

    List<GameObject> object = new LinkedList<GameObject>();
    Player player;

    public void tick(){
        for (GameObject object :
                object) {
            object.tick();
        }


        for (GameObject object : object){
            if (object != player && player.isHit() == false){
                if (object.getX()+16 >= player.getX() && object.getX() <= player.getX()+32 &&
                object.getY()+16 >= player.getY() && object.getY() <= player.getY()+32){
                    player.setHit(true);
                }
            }
        }
    }

    public void render(Graphics g){
        for (GameObject object :
                object) {
            object.render(g);
        }
    }

    public void addObject(GameObject object){
        this.object.add(object);
        if (object.getId() == ID.Player){
            player = (Player) object;
        }
    }

    public void removeObject(GameObject object){
        this.object.remove(object);
    }
}

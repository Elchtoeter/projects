
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Handler {

    List<GameObject> object = new LinkedList<GameObject>();

    public void tick(){
        for (GameObject object :
                object) {
            object.tick();
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
    }

    public void removeObject(GameObject object){
        this.object.remove(object);
    }
}

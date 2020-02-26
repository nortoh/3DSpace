/*
* SI UNITS
*/
package come.dspace.src;

import java.util.ArrayList;
import java.util.List;
import javax.vecmath.Vector3f;

/**
 *
 * @author Christian
 */
public class Space implements Runnable {

    public static final double GRAVITATIONAL_CONSTANT = 6.7  * Math.pow(10, -11);
    
    private final List<PointObject> objects;
    private final Thread thread;
    
    private boolean isRunning;
    
    public Space() {
        this.objects = new ArrayList();
        this.isRunning = false;
        this.thread = new Thread(this);
    }
    
    public final void start() {
        System.out.println("Starting 3DSpace");
        thread.start();
    }
    
    @Override
    public void run() {
        this.isRunning = true;
        
        PointObject blackHole = new PointObject(this, new Vector3f(0,0,0), 10, 10);
        addObject(blackHole);
        
        while(this.isRunning) {

        }
    }
    
    public void addObject(PointObject object) {
        this.objects.add(object);
        System.out.println("Adding " + object);
    }
    
    public static void main(String[] args) {
        new Space().start();
    }
}

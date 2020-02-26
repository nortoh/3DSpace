package come.dspace.src;

import javax.vecmath.Vector3f;

/**
 *
 * @author Christian
 */
public class PointObject {

    private final Space space;
    private final Vector3f vector3f;
    private final double mass;
    private final double radius;
    
    public PointObject(Space space, Vector3f vector3f, double radius, double mass) {
        this.space  = space;
        this.vector3f = vector3f;
        this.radius = radius;
        this.mass = mass;
   }
    
    public final void move(Vector3f offset) {
        this.vector3f.add(offset);
    }
    
    public final Vector3f coordinates() {
        return this.vector3f;
    }
    
    public final double mass() {
        return this.mass;
    }
    
    public final double radius() {
        return this.radius;
    }
    
    @Override
    public String toString() {
        return "{" + this.vector3f + ", mass: " + this.mass + ", radius: " + this.radius + "}";
    }
}

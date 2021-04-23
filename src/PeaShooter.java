import java.awt.*;
import java.util.ArrayList;


public class PeaShooter extends Towers
{
    public PeaShooter( int x, int y )
    {
        super( x, y, 100, 50 );
    }

    public void shoot( ArrayList<Projectile> projectiles, Enemy target )
    {
        double dx = target.x - x;
        double dy = target.y - y;
        double dz = Math.sqrt( dx*dx + dy*dy );
        projectiles.add( new Projectile( x, y, 8 * dx / dz, 8 * dy / dz ) );
    }

    public void draw( Graphics2D g )
    {
        g.setColor( Color.BLUE );
        g.fillRect( getX() - getWidth(), getY() - getWidth(), 2 * getWidth(), 2 * getWidth() );
        g.setColor( Color.RED );
        g.fillOval( getX() - getWidth() / 2, getY() - getWidth() / 2, getWidth(), getWidth());
    }
}

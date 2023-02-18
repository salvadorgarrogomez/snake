
import java.awt.Point;
import java.util.Random;

/**
 *
 * @author Salvador Garro Gomez
 */

public class Portal {

    private int nature; 
    private int start;
    private int end;

    public Portal(int maxCells) {   
        Random luck = new Random();
        start = luck.nextInt(maxCells);
        end = luck.nextInt(maxCells);
        if (start < end) {
            nature = 1;
        } else {
            nature = -1;
        }
    }

    public int returnNature() {
        return nature;
    }

    public int returnStart() {
        return start;
    }

    public int returnEnd() {
        return end;
    }

}


import javax.swing.SwingUtilities;

/**
 *
 * @author Salvador Garro Gomez
 */

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setSize(600, 400);
                mw.setTitle("Snake and Ladder");
                mw.setVisible(true);
            }
        });
    }

}

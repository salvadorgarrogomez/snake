
import java.awt.Color;

/**
 *
 * @author Salvador Garro Gomez
 */

public class Player {

    private String name;
    private int playerPosn;
    private int playerScore;
    private Color playerColor;

    public Player(int no) {
        name = "Player " + no;
        playerPosn = 0;
    }

    public int getPosition() {                                                  //  Return cambiado por un get, ejercicio 2.1
        return playerPosn;
    }

    public String getName() {                                                   //  Return cambiado por un get ejercicio 2.1
        return name;
    }

    public void setPosition(int posn) {
        playerPosn = posn;
    }

    public void incPosition(int posn) {
        playerPosn += posn;
    }

    public void setPlayerColor(Color c) {
        playerColor = c;
    }

    public Color getPlayerColor() {                                             //  Return cambiado por un get ejercicio 2.1
        return playerColor;
    }

    public void incPlayerScore(int a) {
        playerScore += a;
    }

    public int getPlayerScore() {                                               //  Return cambiado por un get ejercicio 2.1
        return playerScore;
    }

}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//needs massive aesthetic rewrites
public class PlayerSelectScreen extends JPanel {

    JButton go;
    JButton quit;
    MainWindow mw;

    JRadioButton opt1;
    JRadioButton opt2;
    JRadioButton opt3;

    public void quitButtonActionListener() {
        mw.showCard("One");
    }

    public void goButtonActionListener() {
        playerOptions();
        mw.s4.setUpPlayers();
        mw.showCard("Three");
    }

    public void playerOptions() {
        int m = 5;
        if (opt1.isSelected() == true) {
            m = 1;
        } else if (opt2.isSelected() == true) {
            m = 2;
        } else if (opt3.isSelected() == true) {
            m = 3;
        }
        mw.s4.setMaxPlayers(m);
    }

    public PlayerSelectScreen(MainWindow mw) {
        final String select_Players_ = "Select Players: ";                      //  Variable extraida para el ejercicio 2.2.
        final String default_1Player = "Default: 1Player";                      //  Variable extraida para el ejercicio 2.2.
        final String _PlayerDefault = "1 Player(Default)";                      //  Variable extraida para el ejercicio 2.2.
        final String _Players = "2 Players";                                    //  Variable extraida para el ejercicio 2.2.
        final String _Players1 = "3 Players";                                   //  Variable extraida para el ejercicio 2.2.

        this.mw = mw;

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        JLabel mess = new JLabel(select_Players_);
        add(mess);

        JLabel uc = new JLabel(default_1Player);
        add(uc);

        //set up radio buttons
        opt1 = new JRadioButton(_PlayerDefault);
        opt1.setSelected(true);
        opt2 = new JRadioButton(_Players);
        opt3 = new JRadioButton(_Players1);

        ButtonGroup grp = new ButtonGroup();
        grp.add(opt1);
        grp.add(opt2);
        grp.add(opt3);

        add(opt1);
        add(opt2);
        add(opt3);

        final ActionListener actionListener = new ActionListener() {            //  Variable extraida para el ejercicio 2.2.
            public void actionPerformed(ActionEvent event) {
                playerOptions();
            }
        };

        opt1.addActionListener(actionListener);
        opt2.addActionListener(actionListener);
        opt3.addActionListener(actionListener);
        go = new JButton("Customize Board");
        quit = new JButton("Back");

        final ActionListener actionListener1 = new ActionListener() {           //  Variable extraida para el ejercicio 2.2.
            public void actionPerformed(ActionEvent event) {
                goButtonActionListener();
            }
        };

        go.addActionListener(actionListener1);

        final ActionListener actionListener2 = new ActionListener() {           //  Variable extraida para el ejercicio 2.2.
            public void actionPerformed(ActionEvent event) {
                quitButtonActionListener();
            }
        };

        quit.addActionListener(actionListener2);

        add(go);
        add(quit);

    }

}

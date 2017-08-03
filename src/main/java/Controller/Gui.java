package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    private JButton lightSwitch;
    private JButton tempPlus;
    private JButton tempMinus;
    private JButton curtainSwitch;
    private JPanel myPanel;
    private JTextField lightStatus;
    private JTextField tempStatus;
    private JTextField curtainStatus;
    private JFrame frame = new JFrame("Home Control System");

    private int tempShouldBe = 20;

    private boolean curtainUp = false;
    private boolean lightOn = false;

    RemoteControl rc;

    public Gui(final RemoteControl rc) {

        this.rc = rc;
        createWindow();

        // ACTION LISTENERS
        lightSwitch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!lightOn){
                    rc.pushUpButton(1);
                    lightStatus.setText("Light switch On");
                    lightSwitch.setText("OFF");
                    lightOn = true;
                } else {
                    rc.pushDownButton(1);
                    lightStatus.setText("Light switch Off");
                    lightSwitch.setText("ON");
                    lightOn = false;
                }
            }
        });
        tempPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tempShouldBe < 30){
                    rc.pushUpButton(3);
                    tempShouldBe = tempShouldBe +1;
                    tempStatus.setText(Integer.toString(tempShouldBe) + " °C");
                } else {
                    tempStatus.setText("Already MAX temp: " + Integer.toString(tempShouldBe) + " °C");
                }
            }
        });
        tempMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tempShouldBe > 15){
                    rc.pushDownButton(3);
                    tempShouldBe = tempShouldBe -1;
                    tempStatus.setText(Integer.toString(tempShouldBe) + " °C");
                } else {
                    tempStatus.setText("Already MIN temp: " + Integer.toString(tempShouldBe) + " °C");
                }
            }
        });
        curtainSwitch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!curtainUp){
                    curtainStatus.setText("Curtain Up");
                    rc.pushUpButton(2);
                    curtainSwitch.setText("DOWN");
                    curtainUp = true;
                } else {
                    rc.pushDownButton(2);
                    curtainStatus.setText("Curtain Down");
                    curtainSwitch.setText("UP");
                    curtainUp = false;
                }
            }
        });
    }

    private void createWindow(){
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(430,300);
        tempStatus.setText(Integer.toString(tempShouldBe) + " °C");
        frame.setVisible(true);
    }

}

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonListener implements ActionListener/* , CustomInterface*/{

    JButton button;
    String name;
    JPanel body;
    int clock = 0;
    int mils;
    boolean flag = false;
    

    public ButtonListener(){
        System.out.println();
    }

    public ButtonListener(JButton button, JPanel body){
        this.button = button;
        this.button.setName(button.getName());
        this.body = body;
        this.name = button.getName();
        mils = speedButtonListener.mils;
    }

    public void printButton(){
        System.out.println(button.getText());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Legacy code
        /*if(button.getText().equalsIgnoreCase("Pause")){
            flag = true;
            System.out.println(clock);
            System.out.println(flag + "\n");
        }*/

        if(button.getText().equalsIgnoreCase("Reset")){
            for(int i = 0; i < 225; i++){

                body.getComponent(i).setBackground(Color.BLACK);

                //The code below is used to retrieve the grid-components
                //System.out.println(body.getComponent(i));
            }
        }
    }

    public Component getButton() {
        return button;
    }

    public String getButtonText(){
        return button.getText();
    }
    
    public String getName(){
        return button.getName();
    }

    public int getMils(){
        return mils;
    }
}

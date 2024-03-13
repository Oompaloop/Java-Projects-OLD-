import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

public class speedButtonListener extends ButtonListener {
    JButton buttonUlt;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JPanel body;
    String name;
    static int mils = 1000;

    public speedButtonListener(JButton button1, JButton button2, JButton button3, JButton button4, JPanel body){
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
        this.button4 = button4;
        this.button1.setName(button1.getName());
        this.button2.setName(button2.getName());
        this.button3.setName(button3.getName());
        this.button4.setName(button4.getName());
        this.body = body;
    }

    @Override
    public void actionPerformed(ActionEvent e){

        //System.out.println(e.getActionCommand());
        
        /*if(e.getActionCommand().equalsIgnoreCase("Pause")){
            flag = true;
            System.out.println(clock);
            System.out.println(flag + "\n");
        }*/
        if(e.getActionCommand().equalsIgnoreCase("Play")){

            while(flag == false){

                if(e.getActionCommand().equalsIgnoreCase("Pause")){
                    flag = true;
                    System.out.println(clock);
                    System.out.println(flag + "\n");
                }

                clock++;
                System.out.println(clock);
                System.out.println(flag);
                System.out.println("@ " + mils + " milliseconds");
                body = Logic.logic(body);

                try {
                    Thread.sleep(mils);
                } 
                catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

                if(flag == true){
                    break;
                }
            }

            /*for(int i = 0; i < 225; i++){
                System.out.println(body.getComponent(i).getName());
            }*/

            /*for(int i = 0; i < 225; i++){
                    System.out.println(body.getComponent(i).getBackground() + "\n");
            }*/
        }
        else if(e.getActionCommand().equalsIgnoreCase("Slow Down")){
            mils += 250;
            System.out.println(mils);
        }
        else if(e.getActionCommand().equalsIgnoreCase("Speed Up")){

            if(mils <= 0){
                mils = 250;
            }

            mils -= 250;
            System.out.println(mils);

            
        }
    }

    public String getButtonText1(){
        return button1.getText();
    }

    public String getButtonText2(){
        return button2.getText();
    }

    public String getButtonText3(){
        return button3.getText();
    }

    public String getButtonText4(){
        return button4.getText();
    }

    public String getButtonName1(){
        return button1.getName();
    }

    public String getButtonName2(){
        return button2.getName();
    }

    public String getButtonName3(){
        return button3.getName();
    }

    public String getButtonName4(){
        return button4.getName();
    }

    public JPanel getBody(){
        return body;
    }
}

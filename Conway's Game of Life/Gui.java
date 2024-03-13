import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Gui extends ButtonListener{

    //Generalized Border-Components
    Border borderBlue = BorderFactory.createLineBorder(Color.BLUE, 2);
    Border borderLGray = BorderFactory.createLineBorder(Color.GRAY, 2);
    

    public Gui(){

        int x, y;
        x = y = 0x3d4;
        //Initial frame creation and customization
        JFrame frame = new JFrame("Conway's Game of Life");
        
        //980 by 980
        frame.setSize(x, y);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);





        //Game-body declaration and customization
        JPanel body = new JPanel();
        body.setLayout(new GridLayout(15, 13, 1, 1));
        body.setBounds(160,0,800,980);
        body.setVisible(true);
        body.setBackground(Color.BLACK);
        //Tile color-change based on click
        createTiles(body);


        //Control panel/side bar declaration and customization
        JPanel sideBar = new JPanel();  
        sideBar.setBounds(0,0, 160, 980);
        sideBar.setBackground(Color.DARK_GRAY);
        sideBar.setBorder(borderLGray);
        sideBar.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));


        
        

        //Creates and adds buttons to the sidebar panel

        JButton pause = new JButton("Pause");
        pause.setName("Pause");

        System.out.println("");

        JButton reset = new JButton("Reset");
        reset.setName("Reset");
        ButtonListener bre = new ButtonListener(reset, body);
        reset.addActionListener(bre);
        System.out.println(bre.getButtonText());
        System.out.println(bre.getName());
        
        System.out.println("");

        JButton play = new JButton("Play");
        play.setName("Play");
        body.setVisible(true);
        JButton speedUp = new JButton("Speed Up");
        speedUp.setName("Speed Up");
        JButton slowDown = new JButton("Slow Down");
        slowDown.setName("Slow Down");

        speedButtonListener bsusd = new speedButtonListener(speedUp, slowDown, play, pause, body);
        play.addActionListener(bsusd);
        pause.addActionListener(bsusd);
        speedUp.addActionListener(bsusd);
        slowDown.addActionListener(bsusd);

        System.out.println(bsusd.getButtonText1());
        System.out.println(bsusd.getButtonName1());

        System.out.println("");

        System.out.println(bsusd.getButtonText2());
        System.out.println(bsusd.getButtonName2());

        System.out.println("");
        
        System.out.println(bsusd.getButtonText3());
        System.out.println(bsusd.getButtonName3());

        System.out.println("");
        
        System.out.println(bsusd.getButtonText4());
        System.out.println(bsusd.getButtonName4());



        sideBar.add(play);
        sideBar.add(pause);
        sideBar.add(reset);
        sideBar.add(speedUp);
        sideBar.add(slowDown);
        sideBar.setVisible(true);
        


        //Attached to the side bar, this component is meant to adjust the horizontal size of the side bar when clicked and dragged with a mouse.
        JPanel varBar = new JPanel();
        varBar.setBounds(150, 480, 10, 50);
        varBar.setBackground(Color.GREEN);
        varBar.setBorder(borderBlue);
        varBar.setVisible(true);

        //draggable control panel
        dragPane(sideBar, varBar);
        
        

        frame.add(body);
        frame.add(varBar);
        frame.add(sideBar);
        frame.setVisible(true);
    }


    //Handles tile manipulation
    public static void createTiles(JPanel body){

        Color seperator = new Color(0x3A , 0x3A , 0x3A );
        Border border = BorderFactory.createLineBorder(seperator, 1);

        for(int i = 0; i < 225; i++){
            //135 = 15x9 grid
            //165 = 15x11 grid
            //195 = 15x13 grid
            //225 for a 15x15 grid
            //255 = 15x17 grid
            JPanel panel = new JPanel();
            panel.setBackground(Color.BLACK);
            panel.setBorder(border);
            panel.setVisible(true);
            panel.setName("P" + i);
            
            class CustomMouseListener implements MouseListener {
                
                @Override
                public void mouseClicked(MouseEvent e) {

                    if(panel.getBackground() == Color.BLACK){
                        panel.setBackground(Color.WHITE);
                    }
                    else{
                        panel.setBackground(Color.BLACK);
                    }
                }
            
                @Override
                public void mousePressed(MouseEvent e){}
            
                @Override
                public void mouseReleased(MouseEvent e){}
            
                @Override
                public void mouseEntered(MouseEvent e){}
            
                @Override
                public void mouseExited(MouseEvent e){}
            }

            panel.addMouseListener(new CustomMouseListener());

            body.add(panel);
        }
    }





    //Handles Draggable Control-Panel mechanics
    public static void dragPane(JPanel sideBar, JPanel varBar){
        class CustomMouseListener implements MouseMotionListener{
            @Override
            public void mouseDragged(MouseEvent e){
                
                sideBar.setBounds(0,0,e.getX(),960);
                varBar.setBounds(e.getX(), 480, 10, 50);

                //Setting maximum and minimum x-coordinate constraints for draggable side-bar 
                if(sideBar.getWidth() > 160 || varBar.getX() > 150){
                    sideBar.setBounds(0,0,160,960);
                    varBar.setBounds(150, 480, 10, 50);
                }
                else if(sideBar.getWidth() < 0 || varBar.getX() < 0){
                    sideBar.setBounds(0,0,0,960);
                    varBar.setBounds(0, 480, 10, 50);
                }
            }
        
            @Override
            public void mouseMoved(MouseEvent e) {
                //empty
            }
        }

        varBar.addMouseMotionListener(new CustomMouseListener());
    }

}
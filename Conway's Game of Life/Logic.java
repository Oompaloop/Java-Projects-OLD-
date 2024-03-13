import javax.swing.JPanel;
import java.awt.*;

public class Logic {

    JPanel body;

    public Logic(JPanel body){
        this.body = body;
    }

    //handles Game of Life Logic
    public static JPanel logic(JPanel body){
        boolean flag;
        for(int i = 0; i < 225; i++){
            System.out.println(body.getComponent(i).getBackground());
        }

        JPanel[][] predecessor = new JPanel[15][15];
        flag = false;
        predecessor = fillArr(predecessor, body, flag);

        JPanel[][] successor = new JPanel[15][15];
        flag = true;
        successor = fillArr(successor,body, flag);

        body = GameOfLife(predecessor, successor, body);
        body.setVisible(true);

        //create 2, 2d arrays.
        //1st temporary array holds the current state of the board and is used as comparison for the 2nd updated
        //array, which will hold the new state of the board.
        return body;
    }

    public static JPanel[][] fillArr(JPanel[][] arr, JPanel body, boolean flag){
        if(flag == false){
            int x = 0;
            for(int i = 0; i < 15; i++){
                for(int j = 0; j < 15; j++){
                    Color c = body.getComponent(x).getBackground();
                    arr[i][j] = (JPanel) body.getComponent(x);
                    arr[i][j].setBackground(c);
                    x++;
                }
            }
        }
        else if(flag == true){
            for(int i = 0; i < 15; i++){
                for(int j = 0; j < 15; j++){
                    JPanel panel = new JPanel();
                    panel.setBackground(Color.BLACK);
                    arr[i][j] = panel;
                }
            }
        }
        return arr;
    }

    public static void printArr(JPanel[][] arr){
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                System.out.println(arr[i][j].getName());
            }
        }
    }

    public static JPanel GameOfLife(JPanel[][] predecessor, JPanel[][] successor, JPanel body){
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                int count = 0;

                //corners

                //top left
                if(j == 0 && i == 0){
                    if(predecessor[i][j].getBackground() == Color.BLACK){
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }



                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }



                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                }



                //top right
                else if(j == 14 && i == 0){
                    if(predecessor[i][j].getBackground() == Color.BLACK){
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }



                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        
                        
                        
                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                }



                //bottom left
                else if(j == 0 && i == 14){
                    if(predecessor[i][j].getBackground() == Color.BLACK){
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }



                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }



                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                } 



                //bottom right
                else if(j == 14 && i == 14){
                    if(predecessor[i][j].getBackground() == Color.BLACK){
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }



                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }



                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                }

                //sides

                //left
                else if(j == 0){
                    if(predecessor[i][j].getBackground() == Color.BLACK){
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
    
                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){

                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }

                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                }

                //right
                else if(j == 14){
                    if(predecessor[i][j].getBackground() == Color.BLACK){
                        if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
    
                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){
                        
                        if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }

                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                }

                //top
                else if(i == 0){
                    if(predecessor[i][j].getBackground() == Color.BLACK){
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
    
                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){

                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                    }
                        if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                }

                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;

                    }
                }

                //bottom
                else if(i == 14){
                    if(predecessor[i][j].getBackground() == Color.BLACK){

                        if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }

                        if(count == 3){
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                    else if(predecessor[i][j].getBackground() == Color.WHITE){

                        if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                            count++;
                        }
                        if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                            count++;
                        }

                        if(count < 2 || count > 3){
                            successor[i][j].setBackground(Color.BLACK);
                        }
                        else{
                            successor[i][j].setBackground(Color.WHITE);
                        }
                        count = 0;
                    }
                }
                //rest of body

                else if(predecessor[i][j].getBackground() == Color.BLACK){
                    if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                        count++;
                    }

                    if(count == 3){
                        successor[i][j].setBackground(Color.WHITE);
                    }
                    count = 0;
                }
                else if(predecessor[i][j].getBackground() == Color.WHITE){
                    if(predecessor[i-1][j-1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i-1][j].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i-1][j+1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i][j-1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i][j+1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i+1][j-1].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i+1][j].getBackground().equals(Color.WHITE)){
                        count++;
                    }
                    if(predecessor[i+1][j+1].getBackground().equals(Color.WHITE)){
                        count++;
                    }

                    if(count < 2 || count > 3){
                        successor[i][j].setBackground(Color.BLACK);
                    }
                    else{
                        successor[i][j].setBackground(Color.WHITE);
                    }
                    count = 0;
                }

                /*
                (1)     (i-1, j-1)
                (2)     (i-1, j)
                (3)     (i-1, j+1)
                (4)     (i, j-1)
                (5)     (i, j+1)
                (6)     (i+1, j-1)
                (7)     (i+1, j)
                (8)     (i+1, j+1)
                */
            }
        }
        body.removeAll();
        int c = 0;
        for(int i = 0; i < 15; i++){
            for(int n = 0; n < 15; n++){
                JPanel temp = successor[i][n];
                temp.setName("P-" + c);
                body.add(temp);
                c++;
            }
        }
        c = 0;
        return body;
    }

    /* (1) Any live cell with fewer than two live neighbours dies, as if by underpopulation.
    (2) Any live cell with two or three live neighbours lives on to the next generation.
    (3) Any live cell with more than three live neighbours dies, as if by overpopulation.
    (4) Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction. */
}

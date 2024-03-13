import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public interface CustomInterface extends ActionListener{

    public void resetActionPerformed(ActionEvent e);

    public void playActionPerformed(JButton button, ActionEvent e);

    public void pauseActionPerformed(ActionEvent e);
}

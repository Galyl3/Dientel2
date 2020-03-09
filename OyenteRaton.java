
package oyenteraton;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class OyenteRaton extends JFrame{
    public OyenteRaton(){
        super("Titulo de la ventana");

        setLayout(new FlowLayout());
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //if ocurre algo
        JOptionPane.showMessageDialog(null,
         
         "Deve introducir datos en todos los campos",
         "Error de entrada", JOptionPane.ERROR_MESSAGE
        );
    }
    

    public static void main(String[] args) {
            OyenteRaton or=new OyenteRaton();
    }
  
}

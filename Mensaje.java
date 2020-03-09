
package mensaje;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Mensaje extends JFrame {
    public Mensaje(){
    
        super("Titulo de la ventana");
    
        Container p = getContentPane();
        setLayout(new FlowLayout());
        setSize(200,100);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Object[] textoOpciones={"Si adelante", "Ahora no", "Nose"};
        int opcion = JOptionPane.showOptionDialog(null, "Desea continuar?","mensaje", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, textoOpciones,textoOpciones[0]);
    }
    
    public static void main(String[] args) {
Mensaje mj=new Mensaje();    }
    
}


package cambiodecolor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Cambiodecolor extends JFrame{
    JButton rojo = new JButton ("Rojo");
    JButton azul = new JButton ("Azul");
    Container p;
    public Cambiodecolor(){
        super("Color de fondo");
        
        p=this.getContentPane();
        setLayout(new FlowLayout());
        add(rojo);
        add(azul);
        rojo.addActionListener(new OyenteRojo());
        azul.addActionListener(new OyenteAzul());
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class OyenteRojo implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            p.setBackground(Color.red);
        }
    
    }
    class OyenteAzul implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
           p.setBackground(Color.blue);
        }
    
    }
    public static void main(String[] args) {
        Cambiodecolor cc=new Cambiodecolor();
    }
    
}

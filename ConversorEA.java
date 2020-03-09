
package conversorea;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorEA extends JFrame {
    private JTextField cantidad;
    private JButton boton1,boton2;
    
    public ConversorEA (){
    super("Conversor Euros-Pesetas");
    boton1   = new JButton("A euros"  );
    boton2   = new JButton("A pesetas");
    cantidad = new JTextField(10);
    JLabel eti2=new JLabel(new ImageIcon("tenor.gif"));
    add(eti2);
    add(cantidad);
    add(boton1);
    add(boton2);
    setLayout(new FlowLayout());
    boton1.addActionListener(new OyenteBoton());
    boton2.addActionListener(new OyenteBoton());
    setSize(300,300);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    }
    class OyenteBoton implements ActionListener{

        
        public void actionPerformed(ActionEvent ae) {
         Float f=new Float(cantidad.getText());
         float valor= f.floatValue();
         String s=(String)ae.getActionCommand();
         if(s.equals("A euros")){
         valor=(float)(valor/166.321);
         
         }else if(s.equals("A pesetas")){
         valor=(float)(valor*166.321);
         }
         cantidad.setText(Float.toString(valor));
        }
    
    }
    
    public static void main(String[] args) {
        ConversorEA cea=new ConversorEA(); 
    }
    
}

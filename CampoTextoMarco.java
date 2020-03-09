
package campotextomarco;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class CampoTextoMarco extends JFrame{
    private JTextField campoTexto1;//campo de texto con tamano fijo
    private JTextField campoTexto2;//campo de texto construido con texto
    private JTextField campoTexto3;
    private JPasswordField campoContrasena; //campo de constrasena de texto
    //constructo de campoTextoMarco agrega objetos JTextField a JFrame
    public CampoTextoMarco(){
     super("Prueba  de JTextField y JPasswordField");
     setLayout(new FlowLayout());//Establece el esquema del marco
     //construye campo de texto con 10 columnas
     campoTexto1=new JTextField(10);
     add(campoTexto1);//Agrega campoTexto1 a JFrame
     
     //construye campo de texto con texto predeterminado
     campoTexto2=new JTextField("Escriba el texto aqui");
     add(campoTexto2);
     
     campoTexto3= new JTextField("Campo de texto no editable",21);
     campoTexto3.setEditable( false ); // deshabilita la edición
     add(campoTexto3);
     
     //construye campo de contrasena con texto predeterminado38
     campoContrasena=new JPasswordField("Texto oculto");
     add(campoContrasena);
     
     //Registra los manejadores de eventos
     ManejadorCampoTexto manejador= new ManejadorCampoTexto();
     campoTexto1.addActionListener(manejador);
     campoTexto2.addActionListener(manejador);
     campoTexto3.addActionListener(manejador);
     campoContrasena.addActionListener(manejador);
    }//fin del constructor de campoTexto

    //clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener{
   //procesa los eventos de campo de texto
        
        public void actionPerformed(ActionEvent ae) {
              String cadena="";//declara a cadena a mostrar
        
        //el usuario oprimio Intro en el objeto JTextField campoTexto1
        if(ae.getSource()==campoTexto1)
            cadena=String.format("campoTexto1: %s",ae.getActionCommand());
            //el usuario oprimio Intro en el objeto JTextField campoTexto2
        else if(ae.getSource()== campoTexto2)
            cadena=String.format("campoTexto2: %s", ae.getActionCommand());
        //el usuario oprimio Intro en el ibjeto JTextField campo 3
        else if (ae.getSource()==campoTexto3)
            cadena = String.format("campoTexto3: %s",ae.getActionCommand() );
        //El usuario oprimio Intro en el objeto JTextField campoContrasena
        else if(ae.getSource()==campoContrasena)
            cadena=String.format("campoContrasena: %s", new String(campoContrasena.getPassword()));
        //Muestra el contenido del objeto JTextField
        JOptionPane.showMessageDialog(null, cadena);
        }

        
    }
    public static void main(String[] args) {
       CampoTextoMarco cTM=new CampoTextoMarco();
       cTM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cTM.setSize(350,100);
       cTM.setVisible(true);
    }
    
}

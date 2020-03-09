
package labelframe;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;


 
  



public class LabelFrame extends JFrame{
    private JLabel etiqueta1;//JLabel solo con el texto
    private JLabel etiqueta2;//JLabel construida con texto y un icono
    private JLabel etiqueta3;//JLabel con texto adicional e icono

    public LabelFrame(){
        super("Prueba de JLabel");
        setLayout(new FlowLayout());//Establece el esquema del marco
        //constructor de JLabel con un argumento String
        etiqueta1=new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1);//Se agrega etiqueta a JFrame
        
        //Constructor de JLabel con argumentos de cadena,Icono y alineacion
        Icon insecto = new ImageIcon( getClass().getResource("Foca_1k.jpg"));
        etiqueta2=new JLabel("Etiqueta con texto e icono", insecto,SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta 2");
        add(etiqueta2);
        
        etiqueta3 =new JLabel();
        etiqueta3.setText("Etiqueta con icono y texto en la pate inferior");
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta 3");
        add(etiqueta3);
    
    }
    public static void main(String[] args) {
        LabelFrame marcoEtiqueta = new LabelFrame(); // crea objeto LabelFrame
  marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  marcoEtiqueta.setSize( 275, 180 ); // establece el tamaño del marco
  marcoEtiqueta.setVisible( true ); // muestra el marco
  } // fin de main
  } // fin de la clase PruebaLabel
    
    




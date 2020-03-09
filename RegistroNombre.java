/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registronombre;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegistroNombre extends JFrame {
public RegistroNombre(){
super("Titulo de la ventada");
setLayout(new FlowLayout());
//cuando necesitamos el cuadro de dialogo
PanelDatos pd=new PanelDatos();
if(JOptionPane.showConfirmDialog(this, 
   pd,"Introduza datos",
   JOptionPane.OK_CANCEL_OPTION,
   JOptionPane.PLAIN_MESSAGE)
   ==JOptionPane.OK_OPTION){

}

}
class PanelDatos extends JPanel{
public PanelDatos(){


setLayout(new GridLayout(4,2));
JLabel etiquetaNombre=new JLabel("Nombre", JLabel.RIGHT);
JTextField campoNombre=new JTextField();
add(etiquetaNombre);
add(campoNombre);
JLabel etiquetaApellidos=new JLabel("Apellidos", JLabel.RIGHT);
JTextField campoApellidos=new JTextField();
add(etiquetaApellidos);
add(campoApellidos);

JLabel etiquetaNP=new JLabel("N. TELEFONICO", JLabel.RIGHT);
JTextField campoNP=new JTextField();

add(etiquetaNP);
add(campoNP);

ButtonGroup grupoBotones=new ButtonGroup();
JRadioButton manana=new JRadioButton("Grupo manana",true);
JRadioButton tarde=new JRadioButton("Grupo tarde");

grupoBotones.add(manana);
grupoBotones.add(tarde);
add(manana);
add(tarde);
}
}
    
    public static void main(String[] args) {
RegistroNombre rn=new RegistroNombre();
    }
    
}

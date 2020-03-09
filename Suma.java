
package suma;
import javax.swing.JOptionPane;
/**
 *
 * @author galyle
 */
public class Suma {

    
    public static void main(String[] args) {
        String primerNumero=JOptionPane.showInputDialog("Introdusca el primer entero");
        String segundoNumero=JOptionPane.showInputDialog("Introduzca el segundo entero");
        
        //Convierte las entradas String en valores int para usarlos en un calculo
        int numero1=Integer.parseInt(primerNumero);
        int numero2=Integer.parseInt(segundoNumero);
        
        int suma = numero1 + numero2;
        //Muestra los resultados en dialogo de mensajes de JOptionpane
        JOptionPane.showMessageDialog(null,"La suma es"+ suma,"Suma de los enteros",JOptionPane.PLAIN_MESSAGE);
    }
    
}

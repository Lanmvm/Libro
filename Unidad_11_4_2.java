package libro;
// Prueba de LabelFrame.
import javax.swing.JFrame;

public class Unidad_11_4_2
{
    public static void main( String args[] )
    {
       Unidad_11_4_1 marcoEtiqueta = new Unidad_11_4_1(); // crea objeto Unidad_11_4_1
        marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoEtiqueta.setSize( 400, 300 ); // establece el tamaño del marco
        marcoEtiqueta.setVisible( true ); // muestra el marco
    }// fin del main
}// fin de la clase PruebaLabel

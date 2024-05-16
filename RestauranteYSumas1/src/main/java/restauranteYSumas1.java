import javax.swing.JOptionPane;


public class restauranteYSumas1 {

    public static void main(String[] args) {
        
        int num1, num2, suma, n;
        String nombre;
        JOptionPane.showMessageDialog(null, "Hola estimad@ usuari@ " );
        nombre=JOptionPane.showInputDialog(": Escriba su nombre");
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero "));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite su segundo numero "));
        n=Integer.parseInt(JOptionPane.showInputDialog("Cuantas veces quieres repetir? "));
        
        suma = num1 + num2;
        
        // Mostrar la suma
        JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
        
        // Mostrar el nombre ingresado
        JOptionPane.showMessageDialog(null, "Hola, " + nombre);
        
        // Repetir la operación n veces
        for (int i = 0; i < n; i++) {
            num1=Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero "));
            num2=Integer.parseInt(JOptionPane.showInputDialog("Digite su segundo numero "));
            suma = num1 + num2;
            JOptionPane.showMessageDialog(null, "La suma de los números es: " + suma);
        }
    }
}

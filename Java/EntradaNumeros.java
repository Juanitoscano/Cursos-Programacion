import javax.swing.*;
public class EntradaNumeros {

    public static void main(String[] args) {
        
        String num1=JOptionPane.showInputDialog("Introduce un número");

        Double num2=Double.parseDouble(num1);

        System.out.println("La raíz de " + num2 + " es ");

        System.out.printf("%1.2f", Math.sqrt(num2));
        

    }
    
}

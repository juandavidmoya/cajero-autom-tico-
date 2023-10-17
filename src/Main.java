import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int salida_inicial = 2000;
        int opcion;
        float ingreso, retiro, saldoActual;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                bienbenidos a su cajero automatico bancolombia
                1 porfavor ingresar su dinero desiado a la cuenta
                2 porfacor retire el dinero de su cuentan
                 3 salida"""));
        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea ingresar \n"));
                saldoActual = salida_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "dinero en cuenta: " + saldoActual);
                break;
            case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea retirar"));

                if (retiro > salida_inicial) {
                    JOptionPane.showMessageDialog(null, "no cuenta con dinero suficiente para retirar");
                } else {
                    saldoActual = salida_inicial - retiro;
                    JOptionPane.showMessageDialog(null, "dinero en cuenta:" + saldoActual);

                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "se equivoco de opcion de menu");
                break;
        }
    }
}
















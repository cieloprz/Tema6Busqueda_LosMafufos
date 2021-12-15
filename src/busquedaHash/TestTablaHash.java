package busquedaHash;

import javax.swing.JOptionPane;

public class TestTablaHash {

    public static void main(String[] args) {

        try {
            int i, n, resp;
            String nombre = "";
            int precio = 0;
            int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la tabla"));
            TablaHash[] h = new TablaHash[m];
            for (i = 0; i < m; i++) {
                h[i] = new TablaHash();
                h[i].estado = 0;
            }
            do {
                resp = Integer.parseInt(JOptionPane.showInputDialog("TIENDA DEPARTAMENTAL\nMenú Principal \n"
                        + "Insertar (1)\nBuscar (2)\nEliminar (3)\nMostrar (4)\nSalir (5)"));

                switch (resp) {
                    case 1:
                        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NÚMERO DE PRODUCTO"));
                        nombre = JOptionPane.showInputDialog("Ingrese el NOMBRE");
                        precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el PRECIO"));
                        TablaHash.insertaHash(h, m, n, nombre, m);
                        break;
                    case 2:
                        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el NÚMERO DE PRODUCTO a ser buscado en la tabla:"));
                        i = TablaHash.buscaHash(h, m, n);
                        if (i == -1) {
                            JOptionPane.showMessageDialog(null, " NÚMERO DE PRODUCTO no encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, " NÚMERO DE PRODUCTO encontrado");
                        }
                        break;
                    case 3:
                        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  NÚMERO DE PRODUCTO a ser eliminado de la tabla:"));
                        i = TablaHash.eliminaHash(h, m, n);
                        if (i == -1) {
                            JOptionPane.showMessageDialog(null, " NÚMERO DE PRODUCTO no encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, " NÚMERO DE PRODUCTO eliminado con éxito");
                        }
                        break;
                    case 4:
                        TablaHash.mostrarHash(h);
                        break;
                    case 5:
                        System.exit(0);
                    default:
                }
            } while (resp != 5);
        } catch (NumberFormatException nfe) {
            javax.swing.JOptionPane.showMessageDialog(null, "Está Saliendo del Programa");
        } catch (OutOfMemoryError ome) {
            javax.swing.JOptionPane.showMessageDialog(null, "No Hay Espacio");
        }
    }
}

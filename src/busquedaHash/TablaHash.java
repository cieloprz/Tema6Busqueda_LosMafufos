package busquedaHash;

/**
 *
 * @author Cielo PM
 */
public class TablaHash {
    int np;
    String nombre;
    int precio;
    int estado; //0=Vacio, 1=eliminado, 2=ocupado

    static int funcion(int n, int m) {
        return ((n + 1) % m);
    }

    static void insertaHash(TablaHash[] h, int m, int n, String nom, int pre) {
        boolean i = false;
        int j = funcion(n, m);
        do {
            if (h[j].estado == 0 || h[j].estado == 1) {
                h[j].np = n;
                h[j].nombre=nom;
                h[j].precio=pre;
                h[j].estado = 2;
                i = true;
            } else {
                j++;
            }
        } while (j < m && !i);
        if (i) {
            javax.swing.JOptionPane.showMessageDialog(null, "¡Elemento insertado con éxito!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "¡Tabla llena!");
        }
    }

    static int buscaHash(TablaHash[] h, int m, int n) {
        int j = funcion(n, m);
        while (j < m) {
            if (h[j].estado == 0) {
                return -1;
            } else if (h[j].np == n) {
                if (h[j].estado == 1) {
                    return -1;
                } else {
                    System.out.print("NUM. PRODUCTO: "+h[j].np+"\nNOMBRE: "+h[j].nombre
                            +"\tPRECIO: "+h[j].precio);
                    return j;
                }
            } else {
                j++;
            }
        }
        return -1;
    }

    
}
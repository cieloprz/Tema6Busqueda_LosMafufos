package busqueda;
import datos.DatosDesordenados;
import datos.DatosOrdenados;
import javax.swing.JOptionPane;
/**
 * @author Cielo PM
 */
public class TestBusqueda {
    public static void main(String[] args) {
        int n=500;
        int  lim=1000;
        DatosDesordenados dd=new DatosDesordenados(lim, n);
        dd.generarValores();
        System.out.println("Desordenados= "+dd+"\n");
        DatosOrdenados dO=dd.mergeSort();
        System.out.println("Ordenados= "+dO+"\n");
        int min=dO.getMinimo(); int mind=dd.getMinimo();
        int max=dO.getMaximo(); int maxd=dd.getMaximo();
        System.out.println(" \nMínimo= "+mind+" Pos= "+dd.busquedaSecuencial(min)
        +" en datos DESORDENADOS "+"\n");
        System.out.println(" Mínimo= "+min+" Pos= "+dO.busquedaSecuencial(min)
        +" en datos ORDENADOS "+"\n");
        System.out.println(" \nMáximo= "+maxd+" Pos= "+dd.busquedaSecuencial(max)
        +" en datos DESORDENADOS "+"\n");
        System.out.println(" Máximo= "+max+" Pos= "+dO.busquedaSecuencial(max)
        +" en datos ORDENADOS "+"\n");
        int x;
        do {
            x=Integer.parseInt(JOptionPane.showInputDialog("Clave a buscar"));
            System.out.println(" Clave "+x+" pos= "+ dd.busquedaSecuencial(x)
                    +" en datos DESORDENADOS \n");
            System.out.println(" Clave "+x+" pos= "+ dO.busquedaSecuencial(x)
                    +" en datos ORDENADOS/Secuencial \n");
            System.out.println("Clave "+x+" pos= "+ dO.búsquedaBinaria(x)
                    +" en datos ORDENADOS/Binaria \n");
        }while(x!='0');
    }
    
}

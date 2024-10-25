package cl.ucn.solucion;
import cl.ucn.solucion.*;

public class descCantidad implements strategy{
    @Override
    public int aplicarDescuento(List<Producto> productos){
        if (productos.size() > 2){
            descuentoCantProductos = 100;
            return descuentoCantProductos;
        }
        return 0;
    }

}

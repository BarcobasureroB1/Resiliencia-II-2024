package cl.ucn.solucion;

import cl.ucn.solucion.*;

public class descCasa implements strategy{
    @Override
    public int aplicarDescuento(List<Producto> productos){
        for (Producto producto : productos) {
            if (producto.getCategoria().equals("casa"))
                descuentoCategoria = 200;
                return descuentoCategoria;
        }
        return 0;
    }

}

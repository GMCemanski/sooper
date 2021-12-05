package gmcemanski.sooper.productos;

import gmcemanski.sooper.IProducto;
import gmcemanski.sooper.enums.Categoria;

public class Drogueria extends Producto{
    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.DROGUERIA;
    }

    @Override
    public boolean esCompatible(IProducto producto) {
        return false;
    }
}

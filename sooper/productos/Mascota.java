package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Mascota extends Producto{

    public Mascota(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.MASCOTAS;
    }

    @Override
    public boolean esCompatible(IProducto producto) {
        return false;
    }
}

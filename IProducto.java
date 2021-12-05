package gmcemanski.sooper;

import gmcemanski.sooper.enums.Categoria;

public interface IProducto {

    String getReferencia();

    float getPeso();

    Categoria getCategoria();

    float getVolumen();

    float getPrecio(); //es opcional para este ejercicio

    boolean esCompatible(IProducto producto);

    boolean tengoEspacio(IContenedor contenedor);
}


package gmcemanski.sooper.productos;

import gmcemanski.sooper.IContenedor;
import gmcemanski.sooper.IProducto;

public abstract class Producto implements IProducto {

    private String referencia;
    private int peso;
    private int volumen;

    public Producto(String referencia, int peso, int volumen) {
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public float getVolumen() {
        return volumen;
    }

    @Override
    public float getPrecio() {
        return 0;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        return false;
    }
}

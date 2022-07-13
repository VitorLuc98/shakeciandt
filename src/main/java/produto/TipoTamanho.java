package produto;

public enum TipoTamanho {
    P, 
    M,
    G;
    //TODO
    public final double multiplicador;

    TipoTamanho() {
        multiplicador = 0;
    }
}

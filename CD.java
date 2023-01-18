public class CD extends Midia {
    
    private int faixas;
   
    public CD(String nome, double preco, String artista, int faixas) {
        super(nome, preco, artista);
        this.faixas = faixas;
    }

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
    
    
}

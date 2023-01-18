public class Midia extends Produto {
    
    private String artista;

    

    public Midia(String nome, double preco, String artista) {
        super(nome, preco);
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    
    
}

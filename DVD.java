public class DVD extends Midia {

    private int duracao;

    public DVD(String nome, double preco, String artista, int duracao) {
        super(nome, preco, artista);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
}

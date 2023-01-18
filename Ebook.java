//Classe exemplo pedida na questão Extra
public class Ebook extends Livro {
    
    private String formato;

    public Ebook(String nome, double preco, String autor, int paginas, String formato) {
        super(nome, preco, autor, paginas);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    
}

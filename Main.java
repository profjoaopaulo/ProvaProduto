public class Main {
    
    public static void main(String[] args) {
        
        //Declarações/Instanciações/Configurações
        Livro livro = new Livro("Cidades das Cinzas", 45, "Cassandra Clair", 300);
        CD cd = new CD("Amado Batista", 20, "Amado", 20);
        DVD dvd = new DVD("Barbie", 10, "Barbie", 2);
        
        //Imprimindo na tela
        System.out.println("Informações do Livro:");
        System.out.println(livro.getNome() + "\n"
        + livro.getPreco() + "\n" + livro.getAutor() +
        "\n" + livro.getPaginas());
        System.out.println("Informações do CD:");
        System.out.println(cd.getNome() + "\n"
        + cd.getPreco() + "\n" + cd.getArtista() +
        "\n" + cd.getFaixas());
        System.out.println("Informações do DVD:");
        System.out.println(dvd.getNome() + "\n"
        + dvd.getPreco() + "\n" + dvd.getArtista() +
        "\n" + dvd.getDuracao());
    }
}

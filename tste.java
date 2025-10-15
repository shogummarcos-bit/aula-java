class Livro {
    private String titulo;
    private String autor;
    private int anodepublicação;
    private int quantidadedepaginas;

    public Livro(String titulo, String autor, int anodepublicação, int quantidadedepaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anodepublicação = anodepublicação;
        this.quantidadedepaginas = quantidadedepaginas;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnodepublicação() { return anodepublicação; }
    public int getQuantidadedepaginas() { return quantidadedepaginas; }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("Título inválido");
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("Autor inválido");
        }
    }

    public void setAnodepublicação(int anodepublicação) {
        if (anodepublicação > 0) {
            this.anodepublicação = anodepublicação;
        } else {
            System.out.println("Ano de publicação inválido");
        }
    }

    public void setQuantidadedepaginas(int quantidadedepaginas) {
        if (quantidadedepaginas > 0) {
            this.quantidadedepaginas = quantidadedepaginas;
        } else {
            System.out.println("Quantidade de páginas inválida");
        }
    }

    public void calculartempodeleitura() {
        int tempo = quantidadedepaginas * 5;
        System.out.println("O tempo de leitura é " + tempo + " minutos");
    }

    public void exibirinformaçoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anodepublicação);
        System.out.println("Quantidade de páginas: " + quantidadedepaginas);
    }
}

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Vida", "Shuz", 1850, 550);
        livro1.calculartempodeleitura();
        livro1.exibirinformaçoes();
    }
}


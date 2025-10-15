public class Produto {
    // Atributos privados
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    // Construtor padrão
    public Produto() {
    }

    // Construtor com todos os parâmetros
    public Produto(String nome, String codigo, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // Método para adicionar estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    // Método para remover estoque
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade inválida para remover.");
        }
    }

    // Método para calcular o valor total do estoque
    public double valorTotalEstoque() {
        return this.quantidade * this.precoUnitario;
    }
}

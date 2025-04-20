
package etapa3pi;


public class Funcionario {
    private int id;
    private String nome;
    private int idade;
    private String funcao;
    private String senha;
    private Equipe equipe;
    
    // Getters e Setters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getSenha() {
        return senha;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
}

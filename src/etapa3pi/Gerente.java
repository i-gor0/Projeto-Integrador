/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etapa3pi;

public class Gerente {
    private int id;
    private String nome;
    private String senha;
    private Equipe equipe;
    
    // Getters e Setters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
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

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }
    
}

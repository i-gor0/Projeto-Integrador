package etapa3pi;

import java.util.List;

public class Equipe {
    private int id;
    private AreaDeLazer areaDeLazer;
    private List<Funcionario> funcionarios;
    
    // Getters e Setters

    public int getId() {
        return id;
    }

    public AreaDeLazer getAreaDeLazer() {
        return areaDeLazer;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAreaDeLazer(AreaDeLazer areaDeLazer) {
        this.areaDeLazer = areaDeLazer;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}

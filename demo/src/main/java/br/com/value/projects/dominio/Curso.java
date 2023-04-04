package br.com.value.projects.dominio;

public class Curso {
    private String nomeCurso;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    // getters e setters para o atributo
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
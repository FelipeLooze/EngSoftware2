package br.com.value.projects.dominio;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String nome;
    private int moeda;
    private int status;				//1 - Premium | 0 - Normal
    private List<Curso> cursos;
    
    public User(int id, String nome, int moeda, List<Curso> cursos) {
        this.id = id;
        this.nome = nome;
        this.moeda = moeda;
        this.cursos = new ArrayList<Curso>();
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getMoeda() {
        return moeda;
    }
    
    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public void adicionaCurso(Curso curso) {
        this.cursos.add(curso);
        verificaStatus();
    }
    
    public void verificaStatus() {
    	this.status = this.cursos.size() >= 12 ? 1 : 0;
    }
    
    public void adicionaMoeda(int valor) {
        this.moeda += valor;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
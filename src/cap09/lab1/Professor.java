package cap09.lab1;

public class Professor extends Pessoa {
	
	public Professor(String nome, int idade, char sexo, RG rg) {
		super(nome, idade, sexo, rg);
		
	}
	private float salario;
	private String disciplina;
	@Override
	public void falar(String fala) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	

}

package trabalhoamanda;

import java.util.ArrayList;

public class Selecao {
private String nome;
private ArrayList<Goleiro> time;
private Goleiro titular;


public Goleiro getTitular() {
	return titular;
}
public void setTitular(Goleiro titular) {
	this.titular = titular;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Selecao(String nome){
	this.nome= nome;
	this.time= new ArrayList<Goleiro>();
}
public void addGoleiro(Goleiro g) {
	time.add(g);
}
public ArrayList<Goleiro> getTime() {
	return time;
}

}

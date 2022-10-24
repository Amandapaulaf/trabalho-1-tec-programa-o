package trabalhoamanda;

import java.util.ArrayList;

public class Goleiro {
private int id;
private String nome;
private int velocidade;
private int flexibilidade;
private int agilidade;
private int coordenacao;
private int forca;
private int equilibrio;
private ArrayList<Chute> listachute;
private int defesa;
private int gol;
private int mediadefesas;
private int mediagol;
private int aag;
private int ocorrencias;


public int getOcorrencias() {
	return ocorrencias;
}

public void setOcorrencias(int ocorrencias) {
	this.ocorrencias = ocorrencias;
}

public int getDefesa() {
	return defesa;
}

public void setDefesa(int defesa) {
	this.defesa = defesa;
}

public int getGol() {
	return gol;
}

public void setGol(int gol) {
	this.gol = gol;
}

public Goleiro(int id, String nome){
	this.nome= nome;
	this.id= id;
	this.listachute= new ArrayList<Chute>();
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

public int getVelocidade() {
	return velocidade;
}

public void setVelocidade(int velocidade) {
	this.velocidade = velocidade;
}

public int getFlexibilidade() {
	return flexibilidade;
}

public void setFlexibilidade(int flexibilidade) {
	this.flexibilidade = flexibilidade;
}

public int getAgilidade() {
	return agilidade;
}

public void setAgilidade(int agilidade) {
	this.agilidade = agilidade;
}

public int getCoordenacao() {
	return coordenacao;
}

public void setCoordenacao(int coordenacao) {
	this.coordenacao = coordenacao;
}

public int getForca() {
	return forca;
}

public void setForca(int forca) {
	this.forca = forca;
}

public int getMediadefesas() {
	return mediadefesas;
}

public void setMediadefesas(int media) {
	this.mediadefesas = media;
}

public int getEquilibrio() {
	return equilibrio;
}

public void setEquilibrio(int equilibrio) {
	this.equilibrio = equilibrio;
}


public int getMediagol() {
	return mediagol;
}

public void setMediagol(int mediagol) {
	this.mediagol = mediagol;
}
public Goleiro() {
	
}
public int getAag() {
	return aag;
}

public void setAag(int aag) {
	this.aag = aag;
}

public int aag(int velocidade, int flexibilidade, int agilidade, int coordenacao, int forca, int equilibrio) {
	int aag;
	aag= ((velocidade*3)+(flexibilidade*2)+(agilidade*3)+(coordenacao*2)+forca+(equilibrio*2))/8;
	return aag;
}
public void addChute(Chute c) {
	this.listachute.add(c);
}
public ArrayList<Chute> getListachute() {
	return listachute;
}

public void setListachute(ArrayList<Chute> listachute) {
	this.listachute = listachute;
}
public int calcularmediadefesas() {
	int media;
	media=this.getDefesa()/30;
	return media;
}
public int calcularmediagol() {
	int media;
	media=this.getGol()/30;
	return media;
}
}

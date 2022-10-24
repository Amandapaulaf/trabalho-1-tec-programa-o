package trabalhoamanda;

import java.util.ArrayList;
import java.util.Random;

public class Main {
public static ArrayList<Chute> iniciachutes(){
	ArrayList<Chute> listachute;
	listachute= new ArrayList<Chute>();
	Chute c1= new Chute();
	c1.setForca(2);
	c1.setQuadrante(1);
	c1.setX(4);
	c1.setY(7);
	c1.setSituação(4);
	Chute c2= new Chute();
	c2.setForca(6);
	c2.setQuadrante(1);
	c2.setX(3);
	c2.setY(6);
	c2.setSituação(4);
	Chute c3= new Chute();
	c3.setForca(9);
	c3.setQuadrante(2);
	c3.setX(4);
	c3.setY(15);
	c3.setSituação(1);
	Chute c4= new Chute();
	c4.setForca(5);
	c4.setQuadrante(4);
	c4.setX(6);
	c4.setY(11);
	c4.setSituação(4);
	Chute c5= new Chute();
	c5.setForca(3);
	c5.setQuadrante(4);
	c5.setX(8);
	c5.setY(13);
	c5.setSituação(4);
	Chute c6= new Chute();
	c6.setForca(3);
	c6.setQuadrante(3);
	c6.setX(6);
	c6.setY(4);
	c6.setSituação(4);
	Chute c7= new Chute();
	c7.setForca(4);
	c7.setQuadrante(4);
	c7.setX(5);
	c7.setY(8);
	c7.setSituação(4);
	Chute c8= new Chute();
	c8.setForca(7);
	c8.setQuadrante(4);
	c8.setX(7);
	c8.setY(14);
	c8.setSituação(4);
	Chute c9= new Chute();
	c9.setForca(8);
	c9.setQuadrante(4);
	c9.setX(7);
	c9.setY(14);
	c9.setSituação(4);
	Chute c10= new Chute();
	c10.setForca(4);
	c10.setQuadrante(4);
	c10.setX(6);
	c10.setY(12);
	c10.setSituação(4);
	Chute c11= new Chute();
	c11.setForca(2);
	c11.setQuadrante(4);
	c11.setX(5);
	c11.setY(15);
	c11.setSituação(1);
	Chute c12= new Chute();
	c12.setForca(7);
	c12.setQuadrante(3);
	c12.setX(6);
	c12.setY(4);
	c12.setSituação(4);
	Chute c13= new Chute();
	c13.setForca(3);
	c13.setQuadrante(3);
	c13.setX(8);
	c13.setY(2);
	c13.setSituação(4);
	Chute c14= new Chute();
	c14.setForca(9);
	c14.setQuadrante(4);
	c14.setX(7);
	c14.setY(10);
	c14.setSituação(4);
	Chute c15= new Chute();
	c15.setForca(10);
	c15.setQuadrante(4);
	c15.setX(7);
	c15.setY(12);
	c15.setSituação(4);
	Chute c16= new Chute();
	c16.setForca(5);
	c16.setQuadrante(1);
	c16.setX(4);
	c16.setY(2);
	c16.setSituação(4);
	Chute c17= new Chute();
	c17.setForca(3);
	c17.setQuadrante(4);
	c17.setX(5);
	c17.setY(13);
	c17.setSituação(4);
	Chute c18= new Chute();
	c18.setForca(10);
	c18.setQuadrante(2);
	c18.setX(4);
	c18.setY(16);
	c18.setSituação(2);
	Chute c19= new Chute();
	c19.setForca(10);
	c19.setQuadrante(4);
	c19.setX(5);
	c19.setY(16);
	c19.setSituação(2);
	Chute c20= new Chute();
	c20.setForca(10);
	c20.setQuadrante(2);
	c20.setX(3);
	c20.setY(14);
	c20.setSituação(4);
	Chute c21= new Chute();
	c21.setForca(9);
	c21.setQuadrante(2);
	c21.setX(1);
	c21.setY(8);
	c21.setSituação(3);
	Chute c22= new Chute();
	c22.setForca(4);
	c22.setQuadrante(4);
	c22.setX(8);
	c22.setY(16);
	c22.setSituação(2);
	Chute c23= new Chute();
	c23.setForca(8);
	c23.setQuadrante(4);
	c23.setX(6);
	c23.setY(14);
	c23.setSituação(4);
	Chute c24= new Chute();
	c24.setForca(7);
	c24.setQuadrante(4);
	c24.setX(7);
	c24.setY(11);
	c24.setSituação(4);
	Chute c25= new Chute();
	c25.setForca(6);
	c25.setQuadrante(1);
	c25.setX(0);
	c25.setY(3);
	c25.setSituação(2);
	Chute c26= new Chute();
	c26.setForca(5);
	c26.setQuadrante(3);
	c26.setX(6);
	c26.setY(7);
	c26.setSituação(4);
	Chute c27= new Chute();
	c27.setForca(3);
	c27.setQuadrante(3);
	c27.setX(8);
	c27.setY(4);
	c27.setSituação(4);
	Chute c28= new Chute();
	c28.setForca(4);
	c28.setQuadrante(3);
	c28.setX(6);
	c28.setY(7);
	c28.setSituação(4);
	Chute c29= new Chute();
	c29.setForca(10);
	c29.setQuadrante(2);
	c29.setX(2);
	c29.setY(13);
	c29.setSituação(4);
	Chute c30= new Chute();
	c30.setForca(7);
	c30.setQuadrante(3);
	c30.setX(5);
	c30.setY(3);
	c30.setSituação(4);
	listachute.add(c30);
	listachute.add(c29);
	listachute.add(c28);
	listachute.add(c27);
	listachute.add(c26);
	listachute.add(c25);
	listachute.add(c24);
	listachute.add(c23);
	listachute.add(c22);
	listachute.add(c21);
	listachute.add(c20);
	listachute.add(c19);
	listachute.add(c18);
	listachute.add(c17);
	listachute.add(c16);
	listachute.add(c15);
	listachute.add(c14);
	listachute.add(c13);
	listachute.add(c12);
	listachute.add(c11);
	listachute.add(c10);
	listachute.add(c9);
	listachute.add(c8);
	listachute.add(c7);
	listachute.add(c6);
	listachute.add(c5);
	listachute.add(c4);
	listachute.add(c3);
	listachute.add(c2);
	listachute.add(c1);
	
	return listachute;
}
private static Copa iniciacopa() {
	Copa copa2022= new Copa();
	Selecao brasil= new Selecao("Brasil");
	Goleiro g1= new Goleiro(1, "pratik skaggs");
	g1.setVelocidade(5);
	g1.setFlexibilidade(7);
	g1.setAgilidade(8);
	g1.setCoordenacao(9);
	g1.setForca(6);
	g1.setEquilibrio(6);
	g1.setListachute(iniciachutes());
	brasil.addGoleiro(g1);
	Goleiro g2= new Goleiro(2,"uehudah hack");
	g2.setVelocidade(9);
	g2.setFlexibilidade(6);
	g2.setAgilidade(8);
	g2.setCoordenacao(8);
	g2.setForca(7);
	g2.setEquilibrio(10);
	brasil.addGoleiro(g2);
	g2.setListachute(iniciachutes());
	Goleiro g3= new Goleiro(3, "edison drye");
	g3.setVelocidade(5);
	g3.setFlexibilidade(8);
	g3.setAgilidade(5);
	g3.setCoordenacao(8);
	g3.setForca(10);
	g3.setEquilibrio(7);
	brasil.addGoleiro(g3);
	g3.setListachute(iniciachutes());
	Goleiro g4= new Goleiro(4, "ajani harrding");
	g4.setVelocidade(6);
	g4.setFlexibilidade(6);
	g4.setAgilidade(5);
	g4.setCoordenacao(8);
	g4.setForca(7);
	g4.setEquilibrio(6);
	brasil.addGoleiro(g4);
	g4.setListachute(iniciachutes());
	Goleiro g5= new Goleiro(5, "orazio hart");
	g5.setVelocidade(5);
	g5.setFlexibilidade(8);
	g5.setAgilidade(7);
	g5.setCoordenacao(9);
	g5.setForca(9);
	g5.setEquilibrio(10);
	brasil.addGoleiro(g5);
	g5.setListachute(iniciachutes());
	Selecao canada= new Selecao("Canada");
	Goleiro g6= new Goleiro(6, "tristan karns");
	g6.setVelocidade(9);
	g6.setFlexibilidade(7);
	g6.setAgilidade(10);
	g6.setCoordenacao(7);
	g6.setForca(7);
	g6.setEquilibrio(6);
	canada.addGoleiro(g6);
	g6.setListachute(iniciachutes());
	Goleiro g7= new Goleiro(7, "niven glaser");
	g7.setVelocidade(10);
	g7.setFlexibilidade(9);
	g7.setAgilidade(7);
	g7.setCoordenacao(6);
	g7.setForca(5);
	g7.setEquilibrio(8);
	canada.addGoleiro(g7);
	g7.setListachute(iniciachutes());
	Goleiro g8= new Goleiro(8, "derwyn devers");
	g8.setVelocidade(10);
	g8.setFlexibilidade(7);
	g8.setAgilidade(9);
	g8.setCoordenacao(5);
	g8.setForca(9);
	g8.setEquilibrio(5);
	canada.addGoleiro(g8);
	g8.setListachute(iniciachutes());
	Goleiro g9= new Goleiro(9, "tod phan");
	g9.setVelocidade(10);
	g9.setFlexibilidade(7);
	g9.setAgilidade(7);
	g9.setCoordenacao(5);
	g9.setForca(5);
	g9.setEquilibrio(6);
	canada.addGoleiro(g9);
	g9.setListachute(iniciachutes());
	Goleiro g10= new Goleiro(10, "eddie hulse");
	g10.setVelocidade(7);
	g10.setFlexibilidade(6);
	g10.setAgilidade(5);
	g10.setCoordenacao(9);
	g10.setForca(7);
	g10.setEquilibrio(5);
	canada.addGoleiro(g10);
	g10.setListachute(iniciachutes());
	Selecao africa= new Selecao("Africa");
	Goleiro g11= new Goleiro(11, "welford yepez");
	g11.setVelocidade(5);
	g11.setFlexibilidade(8);
	g11.setAgilidade(8);
	g11.setCoordenacao(7);
	g11.setForca(7);
	g11.setEquilibrio(8);
	africa.addGoleiro(g11);
	g11.setListachute(iniciachutes());
	Goleiro g12= new Goleiro(12, "rishley snyder");
	g12.setVelocidade(6);
	g12.setFlexibilidade(5);
	g12.setAgilidade(6);
	g12.setCoordenacao(5);
	g12.setForca(7);
	g12.setEquilibrio(6);
	africa.addGoleiro(g12);
	g12.setListachute(iniciachutes());
	Goleiro g13= new Goleiro(13, "milo mccurdy");
	g13.setVelocidade(10);
	g13.setFlexibilidade(9);
	g13.setAgilidade(8);
	g13.setCoordenacao(6);
	g13.setForca(10);
	g13.setEquilibrio(9);
	africa.addGoleiro(g13);
	g13.setListachute(iniciachutes());
	Goleiro g14= new Goleiro(14, "carden justus");
	g14.setVelocidade(8);
	g14.setFlexibilidade(5);
	g14.setAgilidade(8);
	g14.setCoordenacao(5);
	g14.setForca(10);
	g14.setEquilibrio(7);
	g14.setListachute(iniciachutes());
	africa.addGoleiro(g14);
	Goleiro g15= new Goleiro(15, "carlyon gorby");
	g15.setVelocidade(8);
	g15.setFlexibilidade(5);
	g15.setAgilidade(8);
	g15.setCoordenacao(8);
	g15.setForca(8);
	g15.setEquilibrio(6);
	g15.setListachute(iniciachutes());
	africa.addGoleiro(g15);
	Selecao camaroes= new Selecao("Camaroes");
	Goleiro g16= new Goleiro(16, "mungo spangler");
	g16.setVelocidade(8);
	g16.setFlexibilidade(10);
	g16.setAgilidade(9);
	g16.setCoordenacao(8);
	g16.setForca(9);
	g16.setEquilibrio(5);
	g16.setListachute(iniciachutes());
	camaroes.addGoleiro(g16);
	Goleiro g17= new Goleiro(17, "whitmore squires");
	g17.setVelocidade(9);
	g17.setFlexibilidade(10);
	g17.setAgilidade(7);
	g17.setCoordenacao(9);
	g17.setForca(9);
	g17.setEquilibrio(10);
	g17.setListachute(iniciachutes());
	camaroes.addGoleiro(g17);
	Goleiro g18= new Goleiro(18, "pedrog mccurdy");
	g18.setVelocidade(8);
	g18.setFlexibilidade(5);
	g18.setAgilidade(10);
	g18.setCoordenacao(5);
	g18.setForca(7);
	g18.setEquilibrio(7);
	g18.setListachute(iniciachutes());
	camaroes.addGoleiro(g18);
	Goleiro g19= new Goleiro(19, "ridgley leo");
	g19.setVelocidade(8);
	g19.setFlexibilidade(8);
	g19.setAgilidade(8);
	g19.setCoordenacao(9);
	g19.setForca(9);
	g19.setEquilibrio(9);
	camaroes.addGoleiro(g19);
	g19.setListachute(iniciachutes());
	Goleiro g20= new Goleiro(20, "bolton tarin");
	g20.setVelocidade(9);
	g20.setFlexibilidade(8);
	g20.setAgilidade(7);
	g20.setCoordenacao(6);
	g20.setForca(9);
	g20.setEquilibrio(10);
	camaroes.addGoleiro(g20);
	g20.setListachute(iniciachutes());
	Selecao alemanha= new Selecao("Alemanha");
	Goleiro g21= new Goleiro(21, "edson loy");
	g21.setVelocidade(7);
	g21.setFlexibilidade(7);
	g21.setAgilidade(5);
	g21.setCoordenacao(10);
	g21.setForca(10);
	g21.setEquilibrio(7);
	alemanha.addGoleiro(g21);
	g21.setListachute(iniciachutes());
	Goleiro g22= new Goleiro(22, " delling herndon");
	g22.setVelocidade(7);
	g22.setFlexibilidade(5);
	g22.setAgilidade(5);
	g22.setCoordenacao(8);
	g22.setForca(9);
	g22.setEquilibrio(9);
	alemanha.addGoleiro(g22);
	g22.setListachute(iniciachutes());
	Goleiro g23= new Goleiro(23, " senichi lorio");
	g23.setVelocidade(7);
	g23.setFlexibilidade(7);
	g23.setAgilidade(5);
	g23.setCoordenacao(8);
	g23.setForca(10);
	g23.setEquilibrio(5);
	alemanha.addGoleiro(g23);
	g23.setListachute(iniciachutes());
	Goleiro g24= new Goleiro(24, "albin kerner");
	g24.setVelocidade(6);
	g24.setFlexibilidade(7);
	g24.setAgilidade(8);
	g24.setCoordenacao(8);
	g24.setForca(9);
	g24.setEquilibrio(9);
	alemanha.addGoleiro(g24);
	g24.setListachute(iniciachutes());
	Goleiro g25= new Goleiro(25, "jivin justus");
	g25.setVelocidade(9);
	g25.setFlexibilidade(10);
	g25.setAgilidade(8);
	g25.setCoordenacao(7);
	g25.setForca(7);
	g25.setEquilibrio(5);
	g25.setListachute(iniciachutes());
	alemanha.addGoleiro(g25);
	copa2022.addSelecao(brasil);
	copa2022.addSelecao(camaroes);
	copa2022.addSelecao(alemanha);
	copa2022.addSelecao(africa);
	copa2022.addSelecao(canada);
	return copa2022;
}
public static void main(String[] args) {
	Copa c2022= iniciacopa();
	Celulagol[][] gol= new Celulagol[16][9];
	for(int x=0; x<=8; x++) {
		for(int y=0; y<=16; y++) {
		if((x==1 && y<=15 && y!=0)||(x<=8 && x!=0 && y==1)||(x<=8 && x!=0 && y==15)) {
			gol[x][y]= new Celulagol(1); //trave
			gol[x][y].setX(x);
			gol[x][y].setY(y);
		}
		else if((x==0 && y<=16)||(x<=8 && y==0)||(x<=8 && y==16)) {
			gol[x][y]= new Celulagol(2); //fora
			gol[x][y].setX(x);
			gol[x][y].setY(y);
		}
		else if((x==2 && y==2)||(x==2 && y==14)) {
			gol[x][y]=new Celulagol(3); //gaveta
			gol[x][y].setX(x);
			gol[x][y].setY(y);
		}
		else {
			gol[x][y]= new Celulagol(4); //gol
			gol[x][y].setX(x);
			gol[x][y].setY(y);
		}
		}
	}
	for(int x=0; x<=8; x++) {
		for(int y=0; y<=16; y++) {
			if(x<=4 && y<=8) {
				gol[x][y].setQuadrante(1);
			}
			else if(x>4 && y<=8) {
				gol[x][y].setQuadrante(3);
			}
			else if(x<=4 && y>8) {
				gol[x][y].setQuadrante(2);
			}
			else {
				gol[x][y].setQuadrante(4);
			}
		}
	}
	
	//inicialização copa, seleção, goleiros, chutes, e gol.
	for (Selecao s: c2022.getCopa()) {
		for (Goleiro g: s.getTime()) {
			int y, x, aag,cont;
			cont=0;
			Random sorteio= new Random();
			x=sorteio.nextInt(8);
			y=sorteio.nextInt(16);
			aag=g.aag(g.getVelocidade(), g.getFlexibilidade(), g.getAgilidade(), g.getCoordenacao(), g.getForca(), g.getEquilibrio());
			g.setAag(aag);
			//area goleiro
			if(aag%3==0) {
			for(int j=y; j<(aag/3); j++ ) {
			for(int i=x; i<3; i++) {
				if(cont<aag) {
				gol[i][j].setDefesa(1);
				cont++;
				}
			}}}//mapeando a area do goleiro com aag divisivel por 3
			if(aag%3!=0) {
				for(int j=y; j<((aag/3)+1); j++ ) {
				for(int i=x; i<(x+3); i++) {
					if(cont<aag) {
					gol[i][j].setDefesa(1);
					cont++;
					}
			}}}//mapeando a area do goleiro com aag nao divisivel por 3
			for(Chute c: g.getListachute()) { //passando por tdos os chutes
				for(int h=0; x<=8; x++) {
					for(int t=0; y<=16; y++) {
					if((gol[h][y].getX()==c.getX()) && (gol[x][y].getY()==c.getY())) {
						if(gol[h][t].getDefesa()!=1) {
							g.setGol(g.getGol()+1);
						}
						else if(gol[h][t].getDefesa()==1) {
							if(aag%3==0) {
								if((c.getY()==((y-1)+(aag/3)))||(c.getX()==(x+2))||c.getX()==x||c.getY()==y) {
									if(g.getForca()<c.getForca()) {
										g.setGol(g.getGol()+1);
										g.setOcorrencias(g.getOcorrencias()+1);
									}
									else {
										g.setDefesa(g.getDefesa()+1);
									}
								}
								else {
									g.setDefesa(g.getDefesa()+1);
								}
							}
							else if(aag%3!=0) {
									if((c.getY()==(y+(aag/3)))||(c.getX()==(x+2))||c.getX()==x||c.getY()==y) {
										if(g.getForca()<c.getForca()) {
											g.setGol(g.getGol()+1);
											g.setOcorrencias(g.getOcorrencias()+1);
										}
										else {
											g.setDefesa(g.getDefesa()+1);
										}
									}
									else {
										g.setDefesa(g.getDefesa()+1);
									}
							}}
						}//ifgrande
				}}//fors
			}//foreach
			//reiniciando a defesa pro proximo goleiro
			for(int a=0; x<=8; x++) {
				for(int b=0; y<=16; y++) {
				gol[a][b].setDefesa(0);
				}
			}
	}}//forselecaogoleiro
	
	//questoes 1,3,7 e 8
	Goleiro titular= new Goleiro();
	for (Selecao s : c2022.getCopa()) {
		System.out.println("selecao: "+ s.getNome());
		for (Goleiro g: s.getTime()) {
			System.out.println("nome: "+g.getNome());
			System.out.println("AAG: "+ g.getAag());
			System.out.println("gols defendidos: "+g.getDefesa());
			System.out.println("gols tomados: "+ g.getGol());
			g.setMediadefesas(g.calcularmediadefesas());
			System.out.println("media de defesas feitas "+g.getMediadefesas());
			g.setMediagol(g.calcularmediagol());
			System.out.println("media de gols nao defendidos "+g.getMediagol());
			System.out.println("ocorrencias em que o goleiro perdeu a defesa por falta de forca: "+ g.getOcorrencias());
			if(g.getDefesa()>titular.getDefesa()) {
			titular=g;
			}
		}
		s.setTitular(titular);
	}
	//questoes 2
	
	for (Selecao s : c2022.getCopa()) {
		System.out.println("titular da selecao "+s.getNome()+" e "+ s.getTitular().getNome());
	}
	//questao 4 e 5
	int cfora=0;
	int ctravedireita=0;
	int ctravecima=0;
	int cgol=0;
	int ctraveesquerda=0;
	int cgaveta=0;
	for (Chute c: titular.getListachute()) {
		if(c.getSituação()==2) {
			cfora= cfora+1;
		}
		if(c.getSituação()==1) {
			ctravedireita= ctravedireita+1;
		}
		if(c.getSituação()==3) {
			ctravecima= ctravecima+1;
		}
		if(c.getSituação()==4) {
			cgol= cgol+1;
		}
		if(c.getSituação()==5) {
			ctraveesquerda= ctraveesquerda+1;
		}
	}//for chutes
	
	System.out.println("chutes na trave direita: "+ctravedireita);
	System.out.println("chutes fora: "+cfora);
	System.out.println("chutes na trave de cima: "+ctravecima);
	System.out.println("chutes na trave esquerda: "+ctraveesquerda);
	System.out.println("chutes dentro do gol: "+cgol);
	System.out.println("chutes e gols na gaveta: "+cgaveta);
	
	
	
	}}//maineclasse

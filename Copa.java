package trabalhoamanda;

import java.util.ArrayList;

public class Copa {
private ArrayList<Selecao> copa;

public void addSelecao(Selecao s) {
	copa.add(s);
}
public Copa() {
	this.copa= new ArrayList<Selecao>();
}
public ArrayList<Selecao> getCopa() {
	return copa;
}

}

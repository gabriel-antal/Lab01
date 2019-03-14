package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> listaParole; 
		
	public Parole() {
		listaParole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		Collections.sort(listaParole);
		
		return listaParole;
	}
	
	public void reset() {
		listaParole.clear();
	}
	
	public void cancellaSelezione(String s) {
		//String stemp = null;
		//stemp = s;
		for(int i = 0; i<listaParole.size();i++) {
			if(listaParole.get(i).compareTo(s)==0) {
				listaParole.remove(i);
				return;
			}
				
		}
			
	}

}

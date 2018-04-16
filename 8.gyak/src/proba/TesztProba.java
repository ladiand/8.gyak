package proba;

import harmadik.Szinespont;

import java.awt.Color;

import org.omg.CORBA.PUBLIC_MEMBER;

import sajat.ISzinezheto;

public class TesztProba {

	public static void main(String[] args) {
	
	ISzinezheto szinespont = new Szinespont(Color.BLUE);
	
	ISzinezheto szinespont2 = new Szinespont(Color.BLUE);

	System.out.println();
	szinespont.setSzin(Color.GREEN);
	System.out.println(szinespont);
	
	public static void setDefaultSzin(ISzinezheto objektum);
		objektum.setSzin(objektum.alapertelmezettSzin);
	}

}

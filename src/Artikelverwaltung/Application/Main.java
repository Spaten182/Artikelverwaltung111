/**
 * 
 */
package Artikelverwaltung.Application;

import java.io.IOException;
import java.util.List;

import Artikelverwaltung.Modell.*;
import Artikelverwaltung.View.ViewMain;

/**
 * @author nils743
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws IOException {
		
		AArticle art = new Article("4", "4", 4, 6.0, 6.0);
		
		ViewMain mainView = new ViewMain();
			
	}
	
	public static void listToConsole(List<AArticle> list) {
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getArticleNr() + "; ");
			System.out.print(list.get(i).getName() + "; ");
			System.out.print(list.get(i).getAmount() + "; ");
			System.out.print(list.get(i).getPriceBuy() + "; ");
			System.out.print(list.get(i).getPriceSell());
			System.out.println("\n----------------------------");
		}
	
	}
}
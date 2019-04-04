package Artikelverwaltung.Controller;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

import Artikelverwaltung.Modell.Article;
import Artikelverwaltung.View.ViewMain;

public class ControllerCreate extends AController{

	public ControllerCreate(JFrame view) {
		super(view);
		
		// TODO Auto-generated constructor stub
	}
	
	public void confirmButtonClicked(ActionEvent e, String articleNr, String name, int amount,
			double priceBuy, double priceSell, ViewMain view) {
		
		Article a = new Article(articleNr, name, amount, priceBuy, priceSell);
		this.dao.create(a);
		view.refreshTable();
		this.ownView.dispose();
		
		
	}
	
	
	public void cancelButtonClicked(ActionEvent e) {
		this.ownView.dispose();
	}

}

package Artikelverwaltung.Controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import Artikelverwaltung.Modell.AArticle;
import Artikelverwaltung.View.ViewCreate;
import Artikelverwaltung.View.ViewMain;
import DAO.IDAO;

public class MainController extends AController {
	
	private ViewMain viewMain;
	/**
	 * Creates a MainView
	 * @param view
	 */
	public MainController(JFrame view, ViewMain viewMain) {
		super(view);
		// TODO Auto-generated constructor stub
		this.viewMain = viewMain;
	}
	

	public void createButtonClicked(ActionEvent Ae) {
		JFrame createView = new ViewCreate(this.viewMain);
	}
	
	
	public void searchButtonClicked(ActionEvent Ae) {
		
	}
	
	
	public void editButtonClicked(ActionEvent Ae) {
		
	}
	
	
	public void deleteButtonClicked(ActionEvent Ae, String aNr) {
		this.dao.delete(aNr);
	}
	
	public ArrayList<AArticle> getData() {
		return (ArrayList<AArticle>) this.dao.readAll();
	}
	
	
	
}

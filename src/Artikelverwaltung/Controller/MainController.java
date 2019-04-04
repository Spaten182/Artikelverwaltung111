package Artikelverwaltung.Controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import Artikelverwaltung.Modell.AArticle;
import Artikelverwaltung.View.ViewCreate;
import DAO.IDAO;

public class MainController extends AController {
	
	/**
	 * Creates a MainView
	 * @param view
	 */
	public MainController(JFrame view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	

	public void createButtonClicked(ActionEvent Ae) {
		JFrame createView = new ViewCreate();
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

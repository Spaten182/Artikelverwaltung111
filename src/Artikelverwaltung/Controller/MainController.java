package Artikelverwaltung.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.text.View;

import Artikelverwaltung.View.ViewCreate;

public class MainController extends AController {
	
	/**
	 * Creates a MainView
	 * @param view
	 */
	public MainController(JFrame view) {
		super(view);
		// TODO Auto-generated constructor stub
	}
	
	public static void createButtonClicked(ActionEvent Ae) {
		JFrame createView = new ViewCreate();
	}
	
	
	public static void searchButtonClicked(ActionEvent Ae) {
		
	}
	
	
	public static void editButtonClicked(ActionEvent Ae) {
		
	}
	
	
	public static void deleteButtonClicked(ActionEvent Ae) {
		
	}
	
	
	
}

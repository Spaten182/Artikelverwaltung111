package Artikelverwaltung.Controller;

import java.util.List;

import Artikelverwaltung.Modell.AArticle;
import DAO.DAOFactory;
import DAO.IDAO;

public abstract class AController {

	// Attributes
	protected javax.swing.JFrame ownView;
	protected IDAO dao;

	public AController(javax.swing.JFrame view) {
		this.ownView = view;
		this.dao = DAOFactory.createDAO();
	}

	
	/**
	 * 
	 * @return
	 */
	public javax.swing.JFrame getOwnView() {
		return ownView;
	}

	/**
	 * 
	 * @param ownView
	 */
	public void setOwnView(javax.swing.JFrame ownView) {
		this.ownView = ownView;
	}
}

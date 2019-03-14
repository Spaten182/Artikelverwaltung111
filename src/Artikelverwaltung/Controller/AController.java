package Artikelverwaltung.Controller;

import java.util.List;

import Artikelverwaltung.Modell.AArticle;
import DAO.DAOFactory;
import DAO.IDAO;

public abstract class AController {

	// Attributes
	private javax.swing.JFrame ownView;
	private IDAO dao;

	public AController(javax.swing.JFrame view) {
		this.ownView = view;
		this.dao = DAOFactory.createDAO();
	}
	
	public List<AArticle> getDBData() {
		return dao.readAll(); 
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

/**
 * 
 */
package Artikelverwaltung.Modell;

import java.util.List;

import DAO.DAOFactory;
import DAO.IDAO;

import java.io.IOException;

/**
 * @author all
 *
 */
public class Database {
	
	// Attributes
	private List<AArticle> articleList;
	private static final IDAO dao = DAOFactory.createDAO();
	
	
	/**
	 * get the current articleList from DB
	 * @return list of all articles
	 * @throws IOException 
	 */
	public List<AArticle> getArticleList() throws IOException {
		return dao.readAll();
	}

	/**
	 * 
	 * @param articleNr
	 * @return article
	 * @throws IOException 
	 */
	public AArticle getArticle(String articleNr) throws IOException {
		this.articleList = dao.readAll();
		
		for (AArticle aArticle : articleList) {
			if(aArticle.getArticleNr().equals(articleNr)) {
				return aArticle;
			}
		}
		System.out.println("Artikel nicht vorhanden!");
		return null;
	}
	
	/**
	 * adds article to List
	 * @throws IOException 
	 */
	public void addArticle(AArticle newArticle) throws IOException {
		dao.create(newArticle);
		this.articleList = dao.readAll();
	}
	
	/**
	 * Updates an article in the db and list
	 * @param articleNr
	 * @throws IOException
	 */
	public void updateArticle(String articleNr, AArticle newArticle) throws IOException {
		dao.update(articleNr, newArticle);
		this.articleList = dao.readAll();
	}
	
	/**
	 * deletes article from list
	 * @param articleNr
	 * @throws IOException
	 */
	public void deleteArticle(String articleNr) throws IOException {
		dao.delete(articleNr);
		this.articleList = dao.readAll();
		// TODO Ausgaben in DAO oder hier? 
	}
	
	
	
	
}
 
/**
 * 
 */
package Artikelverwaltung.Modell;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author all
 *
 */
public class Database {
	
	// Attributes
	private ArrayList<AArticle> articleList;
	
	
	/**
	 * get the current articleList from DB
	 * @return list of all articles
	 * @throws IOException 
	 */
	public ArrayList<AArticle> getArticleList() throws IOException {
		ArrayList<AArticle> list = new ArrayList<AArticle>();
		DAOText.readAll();
		return list;
	}

	/**
	 * 
	 * @param articleNr
	 * @return article
	 * @throws IOException 
	 */
	public AArticle getArticle(String articleNr) throws IOException {
		this.articleList = DAOText.readAll();
		
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
		DAOText.create(newArticle);
		this.articleList = DAOText.readAll();
	}
	
	/**
	 * Updates an article in the db and list
	 * @param articleNr
	 * @throws IOException
	 */
	public void updateArticle(String articleNr, AArticle newArticle) throws IOException {
		DAOText.update(articleNr, newArticle);
		this.articleList = DAOText.readAll();
	}
	
	/**
	 * deletes article from list
	 * @param articleNr
	 * @throws IOException
	 */
	public void deleteArticle(String articleNr) throws IOException {
		DAOText.delete(articleNr);
		this.articleList = DAOText.readAll();
		// TODO Ausgaben in DAO oder hier? 
	}
	
	
	
	
}
 
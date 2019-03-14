package Artikelverwaltung.Modell;

import java.util.ArrayList;

public interface IDAO {
	
	/**
	 * creates on entry
	 * @param article
	 * @return true/false
	 */
	boolean create(AArticle article);

	/**
	 * creates the new DB
	 * @param inputList
	 * @return
	 */
	boolean createAll(ArrayList<AArticle> inputList);
	
	/**
	 * Reads the DB and returns one article
	 * @param articleNr
	 * @return
	 */
	Article read(String articleNr);
	
	/**
	 * Reads all elements from DB
	 * @return
	 */
	ArrayList<AArticle> readAll();
	
	/**
	 * Changes on entry in DB
	 * @param articleNr
	 * @param newArticle
	 * @return
	 */
	boolean update(String articleNr, AArticle newArticle);
	
	/**
	 * Deletes on entry in DB
	 * @param articleNr
	 * @return
	 */
	boolean delete(String articleNr);
	
}

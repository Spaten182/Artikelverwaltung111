/**
 * 
 */
package DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Artikelverwaltung.Modell.AArticle;
import Artikelverwaltung.Modell.Article;

/**
 * @author nils743
 *
 */
public class DAOText implements IDAO{

	// Attributes
	private static final String dbName = "./src/Artikelverwaltung/Modell/ArticleList.txt";
	private static final File file = new File(dbName);
	private static final String delimiter= "\n";
	
	// Getter & Setter
	
	/**
	 * create a dataset
	 * @throws IOException 
	 */
	@Override
	public boolean create(AArticle article) {
		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			fw.write(delimiter + article.toString());
			fw.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 
	 * @param inputList
	 * @throws IOException
	 */
	@Override
	public boolean createAll(List<AArticle> inputList) {
		FileWriter fw;
		try {
			fw = new FileWriter(file, false);
			for (AArticle aArticle : inputList) {
				fw.write(delimiter + aArticle.toString());
			}
			fw.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	/**
	 * reads one dataset
	 * @param articleNr
	 * @throws IOException 
	 * 
	 */
	@Override
	public Article read(String articleNr) {
		
		List<AArticle> list = this.readAll();
		
		for (AArticle aArticle : list) {
			if(aArticle.getArticleNr().equals(articleNr)) {
				return (Article) aArticle;
			}
		}	
		return null;
	}
	
	/**
	 * read all datasets
	 * @throws IOException 
	 * 
	 */
	@Override
	public List<AArticle> readAll() {
		
		List<AArticle> list = new ArrayList<AArticle>();
		try {
			Scanner scanner = new Scanner(file);
			scanner.useDelimiter(delimiter);
			
			while(scanner.hasNext()) {
				String info[] = scanner.next().split("-");
				list.add(new Article(info[0], info[1], Integer.valueOf(info[2]), Double.valueOf(info[3]), Double.valueOf(info[4])));
			}
			scanner.close();
			return list;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * updates one dataset
	 * @throws IOException 
	 * 
	 */
	@Override
	public boolean update(String articleNr, AArticle newArticle) {
		
		List<AArticle> list = this.readAll();
		
		for (AArticle aArticle : list) {
			if(aArticle.getArticleNr().equals(newArticle.getArticleNr())) {
				System.out.println("Gewählte Artikelnummer ist bereits vorhanden!");
				return false;
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getArticleNr().equals(articleNr)) {
				list.remove(i);
				list.add(i, newArticle);
				break;
			}
		} // end for
			 
		this.createAll(list);
		return true;
	}
		
	
	/**
	 * deletes one dataset
	 * @throws IOException 
	 *
	 */
	@Override
	public boolean delete(String articleNr) {
		
		List<AArticle> list = this.readAll();
		
		for (AArticle aArticle : list) {
			if(aArticle.getArticleNr().equals(articleNr)) {
				System.out.println("Gewählte Artikelnummer ist vorhanden!");
				list.remove(aArticle);
				this.createAll(list);
				return true;
			}
		}
		
		System.out.println("Diese Artikelnummer ist nicht vergeben!");
		return false;
	}
}

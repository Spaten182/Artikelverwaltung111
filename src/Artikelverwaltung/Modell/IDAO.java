package Artikelverwaltung.Modell;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public interface IDAO {
	
	public void create(AArticle article) throws IOException;

	public static void createAll(ArrayList<AArticle> inputList) throws IOException 
	
	public static Article read(String articleNr) throws IOException 
	
	public static ArrayList<AArticle> readAll() throws IOException 
	
	public static boolean update(String articleNr, AArticle newArticle) throws IOException
		
	
	public static boolean delete(String articleNr) throws IOException 
	
}

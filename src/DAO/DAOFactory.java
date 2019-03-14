package DAO;

public class DAOFactory {
	private static IDAO dao;
	
	/**
	 * Singleton of DAOs instance
	 * @return
	 */
	public static IDAO createDAO() {
		if(dao == null) {
			dao = new DAOText();
		}
			return dao;
	}
}

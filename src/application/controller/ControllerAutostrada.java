package application.controller;

import java.util.List;

import application.dao.AutostradaDAO;
import application.dao.DAOFactory;
import application.model.Autostrada;

public class ControllerAutostrada {

	private DAOFactory mysqlfactory;
	private static AutostradaDAO autostradaDao;
	
	public ControllerAutostrada() {
		mysqlfactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		autostradaDao = mysqlfactory.getAutostradaDAO();
	}
	
	public static  ControllerAutostrada getInstance() {
		return new ControllerAutostrada();
	}


	/**
	 * Metodo che restituisce la lista di Autostrade nel Database
	 * @return Lista di Autostrade nel Database
	 */
	
	public List<Autostrada> getAllAutostade() {
    	return autostradaDao.getListOfAutostrada();
	}
	
	/**
	 * Metodo che aggiunge un'Autostrada al Database
	 * @param A Autostrada da aggiungere al Database
	 */
	public void setAutostradaGlobal(Autostrada A) {
		autostradaDao.addAutostrada(A); 
	}

	/**
	 * Metodo che elimina un'Autostrada dal Database
	 * @param A Autostrada da eliminare dal Database
	 */
	public void deleteAutostradaGlobal(Autostrada A) {
		autostradaDao.deleteAutostrada(A);
	}
}


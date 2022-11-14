package part04.controller;

import java.util.List;

import part04.dao.MemDAO;
import part04.dto.MemDTO;

public class MemController {
	private MemDAO dao;
	
	public MemController() {
		dao = new MemDAO();
	}
	public List<MemDTO> selectProcess(){
		return dao.allMethod();
	}
}//end class

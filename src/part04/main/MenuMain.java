package part04.main;

import java.util.List;

import part04.controller.MemController;
import part04.dto.MemDTO;

public class MenuMain {

	public static void main(String[] args) {
		MemController mController = new MemController();
		
		List<MemDTO> aList = mController.selectProcess();
		display(aList);
	}//end main

	public static void display(List<MemDTO> aList) {
		for(MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(),dto.getLoc());
	}//end display
	
}//end class

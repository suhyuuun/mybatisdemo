package part04.main;

import java.util.ArrayList;
import java.util.List;

import part04.controller.MemController;
import part04.dto.MemDTO;

public class MenuMain {

	public static void main(String[] args) {
		MemController mController = new MemController();
		
		//삽입
//		List<MemDTO> insertList = new ArrayList<MemDTO>();
//		insertList.add(new MemDTO("이기용",40, "제주"));
//		insertList.add(new MemDTO("이소라", 33, "대전"));
//		int cnt = mController.multiInsertProcess(insertList);
//		System.out.printf("Insert Count:%d\n",cnt);
		
		//삭제
//		List<Integer> deleteList = new ArrayList<Integer>();
//		deleteList.add(7);
//		deleteList.add(8);
//		int delCnt = mController.multiDeleteProcess(deleteList);
//		System.out.printf("Delete Count:%d\n",delCnt);
		
		//검색
		System.out.println("검색결과");
//		MemDTO dto = new MemDTO();
//		dto.setAge(35);
//		dto.setName("밤");
//		List<MemDTO> searchList = mController.searchProcess(dto);
//		display(searchList);
		
		MemDTO mt = new MemDTO();
		mt.setNum(9);
		mt.setName("홍재수");
		mt.setAge(50);
		int uptCnt = mController.multiUpdateProcess(mt);
		System.out.printf("update Count:%d\n",uptCnt);
		
		List<MemDTO> aList = mController.selectProcess();
		display(aList);
	}//end main

	public static void display(List<MemDTO> aList) {
		for(MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(),dto.getLoc());
	}//end display
	
}//end class

package kr.ac.sku.jdbc;

import java.util.List;

public class BookDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
		BookVO vo = new BookVO();
//		
//		vo.setTitle("asdf");
//		vo.setAuthor("abcd");
//		if(dao.insertBook(vo)) System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
//		else System.out.println("�Է��� �����߽��ϴ�.");
		
//		System.out.println(dao.insertBook(vo));
		
//		BookVO vo = dao.getBook(1);
//		System.out.println(vo.getBookNo());
		
		List<BookVO> bookList = dao.getBookList();
		for(BookVO bookVO : bookList){
			System.out.println(bookVO);
		}
		

	}

}

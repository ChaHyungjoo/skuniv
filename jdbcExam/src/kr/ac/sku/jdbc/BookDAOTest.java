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
//		if(dao.insertBook(vo)) System.out.println("입력이 완료되었습니다.");
//		else System.out.println("입력을 실패했습니다.");
		
//		System.out.println(dao.insertBook(vo));
		
//		BookVO vo = dao.getBook(1);
//		System.out.println(vo.getBookNo());
		
		List<BookVO> bookList = dao.getBookList();
		for(BookVO bookVO : bookList){
			System.out.println(bookVO);
		}
		

	}

}

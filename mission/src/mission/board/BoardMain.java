package mission.board;

public class BoardMain {

	public static void main(String[] args) {
		System.out.println("<게시판 사이트 '다적어'에 오신걸 환영합니다.>\n");
		
		System.out.println("----- 전체 글 목록  -----\n");
		
		GeneralMember gm = new GeneralMember();
		
		Board board1 = new Board(1, "제목1", "내용1", "손");
		Board board2 = new Board(2, "제목2", "내용2", "이");
		
		Comment comment1 = new Comment(1, "이", "굳");
		Comment comment2 = new Comment(2, "손", "오왕");
		
		board1.writeComment(comment1);
		board2.writeComment(comment2);
		
//		board1.showBoard();
		board1.showBoardDetail();
		
		System.out.println();
		
		board2.showBoardDetail();
	}
}

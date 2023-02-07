package mission.board;

public class Board {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Comment myComment;
	
	public Board() {}
	
	public Board(int boardNo, String title, String content, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public void showBoard() {
		System.out.println("글 번호 : " + boardNo);
		System.out.println("작성자 : " + writer);
		System.out.println("글 제목 : " + title);
	}
	
	public void writeComment(Comment comment) {
		myComment = comment;
	}
	
	public void showBoardDetail() {
		System.out.println("글 번호 : " + boardNo);
		System.out.println("작성자 : " + writer);
		System.out.println("글 제목 : " + title);
		System.out.println("글 내용 : " + content);
		myComment.showComment();
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}

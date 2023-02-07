package mission.board;

public class Comment {
	private int commentNo;
	private String writer;
	private String content;
	
	public Comment() {}

	public Comment(int commentNo, String writer, String content) {
		super();
		this.commentNo = commentNo;
		this.writer = writer;
		this.content = content;
	}
	
	public void showComment() {
		System.out.println("======================");
		System.out.println("답변 번호 : " + commentNo);
		System.out.println("답변 작성자 : " + writer);
		System.out.println("답변 내용 : " + content);
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}

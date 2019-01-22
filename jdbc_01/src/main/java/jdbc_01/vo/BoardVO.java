package jdbc_01.vo;

import java.util.Date;

public class BoardVO {
	// 멤버 변수 정의
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regdate;
	
	//생성자 정의
	public BoardVO() {
	
	}
	//  using Field	
	//	public BoardVO(int no, String title, String writer, String content, Date regdate) {
	//		super();
	//		this.no = no;
	//		this.title = title;
	//		this.writer = writer;
	//		this.content = content;
	//		this.regdate = regdate;
	//	}

	// getter setter 정의
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	//마지막 toString() 재정의	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BoardVO [no=");
		builder.append(no);
		builder.append(", title=");
		builder.append(title);
		builder.append(", writer=");
		builder.append(writer);
		builder.append(", content=");
		builder.append(content);
		builder.append(", regdate=");
		builder.append(regdate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

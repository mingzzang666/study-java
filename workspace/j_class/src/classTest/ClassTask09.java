package classTest;

public class ClassTask09 {
//	화면
	
//	게시글과 댓글 정보를 받아서 추가한다.
//	게시글에서는 댓글의 전체 개수를 계산할 수 있다.
	
//	게시글(Post)
//	번호
//	제목
//	내용
	
//	댓글(Reply)
//	번호
//	내용
	
	public static void main(String[] args) {
		Reply[] arReply = {
				new Reply(1, "우와 정말 도움이 되네요!"),
				new Reply(2, "저도 동의해요!"),
		};
		Post post = new Post(1, "비오는날 파전 만드는 법", "안녕하세요, 오늘 소개해드릴 내용은 파전 만드는 레시피에요~!", arReply);
		System.out.println(post.total);
		
		for (int i = 0; i < post.total; i++) {
			System.out.println(post.arReply[i].content);
		}
	}
}












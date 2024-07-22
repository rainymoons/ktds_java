package com.naver.bbs.management;
import com.naver.member.management.Member;

public class Article {

	/**
	 * 게시글의 제목
	 */
	String title;
	
	/**
	 * 게시글의 내용
	 */
	String ditcription;
	
	/**
	 * 게시글 작성자 정보
	 */
	Member author; // import 필요
	
	public static void main(String[] args) {
		
		Article newArticle = new Article();
		newArticle.title = "새로운 게시글";
		newArticle.ditcription = "게시글의 내용";
		
		Member articleAuthor = new Member("userId", "사용자");
		newArticle.author = articleAuthor;
		
		// 게시글 제목 : 새로운 게시글
		System.out.println("게시글 제목 : " + newArticle.title);
		// 게시글 내용 : 게시글의 내용
		System.out.println("게시글의 내용 : " + newArticle.ditcription);
		// 게시글 작성자 ID : userId
		System.out.println("게시글 작성자 ID : " + newArticle.author.getId()); // 안된다.
		// 게시글 작성자 이름: 사용자
		System.out.println("게시글 작성자 이름 : " + articleAuthor.getName()); // 이 방법도 안됨. 메서드로 만들면 되냐? 그래도 안됨.
		
		
	}
	
	
	
}

package com.ch04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ch04.entity.Member;
import com.ch04.entity.member.MemberCrudRepository;

// 스프링 부트 기동 클래스
@SpringBootApplication
public class Ch04Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch04Application.class, args)
		.getBean(Ch04Application.class).execute();
	}

	@Autowired
	MemberCrudRepository repo;
	
	// 등록과 전체 취득 처리
	private void execute() {
		// 등록
		executeInsert();
		// 전체 취득
		executeSelect();
	}
	
	// 등록
	private void executeInsert() {
		// 엔티티 생성(id는 자동 부여되기 때문에 null 설정)
		Member member = new Member(null, "James");
		// 리포지토리를 이용해 등록 수행 및 결과 취득
		member = repo.save(member);
		
		System.out.println("등록 데이터: " + member);
	}
	
	// 전체 취득
	private void executeSelect() {
		System.out.println("전체 데이터를 취득합니다");
		
		// 리포지토리를 이용해 전체 데이터 취득
		Iterable<Member> members = repo.findAll();
		for (Member mem : members) {
			System.out.println(mem);
		}
	}
}

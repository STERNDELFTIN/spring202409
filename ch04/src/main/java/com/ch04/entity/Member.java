package com.ch04.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @Data : 전 필드에 대해 getter/setter로 액세스
 * @NoArgsConstructor : 기본 생성자 자동 생성
 * @AllArgsConstructor : 전 필드에 대해 초기화값을 인수로 가지는 생성자 자동 생성
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	@Id
	private Integer uid;
	private String uname;
}

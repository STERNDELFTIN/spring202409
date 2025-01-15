package com.ch04.entity.member;

import org.springframework.data.repository.CrudRepository;

import com.ch04.entity.Member;

public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}

package com.ezen.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

/*
 * Member 객체를 UserDetails 타입으로 변환하는 클래스
 */
public class SecurityUser extends User {

	public SecurityUser(Member member) {
		// 테이블에서 검색한 Member 정보를 User 클래스로 전달
		super(member.getId(), member.getPassword(), AuthorityUtils.createAuthorityList(member.getRole().toString()));
	}

}

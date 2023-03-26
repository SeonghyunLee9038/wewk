package com.wewk.entity.member;

import com.wewk.common.repository.DefaultJpaRepository;
import com.wewk.entity.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends DefaultJpaRepository<Member, Long>, MemberRepositoryCustom {

}

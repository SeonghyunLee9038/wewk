package com.wewk.repository.member;

import com.wewk.common.repository.DefaultJpaRepository;
import com.wewk.entity.MemberEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends DefaultJpaRepository<MemberEntity, Long>, MemberRepositoryCustom {

}

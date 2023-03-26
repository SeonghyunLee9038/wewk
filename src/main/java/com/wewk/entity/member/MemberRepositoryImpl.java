package com.wewk.entity.member;


import com.wewk.entity.Member;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class MemberRepositoryImpl extends QuerydslRepositorySupport implements MemberRepositoryCustom {

    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     */
    public MemberRepositoryImpl() {
        super(Member.class);
    }


}

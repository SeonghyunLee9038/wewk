package com.wewk.mapStruct;

import com.wewk.entity.member.Member;
import com.wewk.vo.MemberJoinVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper extends GenericMapper<Member, MemberJoinVo> {

}

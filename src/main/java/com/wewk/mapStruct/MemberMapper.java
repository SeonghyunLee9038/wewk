package com.wewk.mapStruct;

import com.wewk.entity.Member;
import com.wewk.vo.MemberJoinVo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    Member joinVoToMember(MemberJoinVo memberJoinVo);
}

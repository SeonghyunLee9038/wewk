package com.wewk.repository;

import com.wewk.entity.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository extends JpaRepository<MemberEntity, long> {


}

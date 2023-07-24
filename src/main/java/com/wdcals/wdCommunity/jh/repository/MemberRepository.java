package com.wdcals.wdCommunity.jh.repository;

import com.wdcals.wdCommunity.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

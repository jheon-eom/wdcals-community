package com.wdcals.wdcommunity.jh.repository;

import com.wdcals.wdcommunity.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

package com.back.p67260811.domain.member.repository

import com.back.p67260811.domain.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface MemberRepository : JpaRepository<Member, Int> {

    // TODO: Optional 반환타입 제거하기
    fun findByUsername(username: String): Optional<Member>
    fun findByApiKey(apiKey: String): Optional<Member>
}

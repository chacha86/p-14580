package com.back.domain.member.member.repository

import com.back.domain.member.member.entity.Member

class MemberRepositoryImpl: MemberRepositoryCustom {

    override fun findQById(id: Long): Member? {
        return Member(1,"test","test")
    }

}
package com.back.domain.post.postUser

import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "member")
class PostUser(
    id:Long,
    var username:String,
    @Column(name="nickname")
    var name:String,
    var profileImgUrl:String?
): BaseEntity(id) {
}
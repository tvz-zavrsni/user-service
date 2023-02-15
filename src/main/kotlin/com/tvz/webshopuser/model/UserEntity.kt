package com.tvz.webshopuser.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column
    val email: String,

    @Column
    val password: String
): Serializable

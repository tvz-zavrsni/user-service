package com.tvz.webshopuser.repository

import com.tvz.webshopuser.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, Long>

package com.tvz.webshopuser.service

import com.tvz.webshopuser.model.UserEntity
import com.tvz.webshopuser.repository.UserRepository
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class UserService (
    val userRepo: UserRepository,
val kafkaTemplate: KafkaTemplate<String, Any>
){

    fun registerUser(user: UserEntity) {
        userRepo.save(user)
    }

    fun findAllUsers(): List<UserEntity> {
        kafkaTemplate.send("user-register", UserEntity(null, "a", "b"))
        return userRepo.findAll()
    }
}

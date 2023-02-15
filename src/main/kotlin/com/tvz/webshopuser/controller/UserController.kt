package com.tvz.webshopuser.controller

import com.tvz.webshopuser.model.UserEntity
import com.tvz.webshopuser.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController(value = "/api")
class UserController(val userService: UserService) {

    @GetMapping(value = ["/users"])
    fun findAllUsers() = userService.findAllUsers()

    @PostMapping(value = ["/register"])
    fun registerUser(@RequestBody user: UserEntity) = userService.registerUser(user)
}

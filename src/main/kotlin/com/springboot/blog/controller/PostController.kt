package com.springboot.blog.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import com.springboot.blog.service.PostService


@RestController
@RequestMapping("/api/posts")
class PostController @Autowired constructor(private val postService: PostService) {

    @GetMapping
    fun getHelloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!!!")
    }

}
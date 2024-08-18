package com.springboot.blog.payload

data class CategoryDto(
    var id: Long? = null,
    var name: String? = null,
    var description: String? = null
)

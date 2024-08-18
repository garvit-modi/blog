package com.springboot.blog.payload

import java.sql.Date
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size

data class PostDto(
    var id: Long? = null,
    
    @field:NotEmpty
    @field:Size(min = 2, message = "Title length should have at least 2 characters")
    var title: String? = null,

    @field:NotEmpty
    @field:Size(min = 10, message = "Post description should have at least 10 characters")
    var description: String? = null,

    @field:NotEmpty
    var image: String? = null,

    var comments: Set<CommentDto>? = null,

    var categoryId: Long? = null,

    var createdBy: String? = null,

    var createDate: Date? = null,

    var lastModifiedBy: String? = null,

    var lastModifiedDate: String? = null,

    var userProfile: String? = null
)

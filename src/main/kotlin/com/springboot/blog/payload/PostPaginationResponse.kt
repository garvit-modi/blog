package com.springboot.blog.payload

import java.util.Date
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size

data class PostPaginationResponse(
    var id: Long? = null,

    @field:NotEmpty
    @field:Size(min = 2, message = "Title length should have at least 2 characters")
    var title: String? = null,

    @field:NotEmpty
    @field:Size(min = 10, message = "Post description should have at least 10 characters")
    var description: String? = null,

    @field:NotEmpty
    var image: String? = null,

    var userProfile: String? = null,

    var categoryId: Long? = null,

    var createDate: Date? = null,

    var lastModifiedBy: String? = null,

    var lastModifiedDate: Date? = null
)

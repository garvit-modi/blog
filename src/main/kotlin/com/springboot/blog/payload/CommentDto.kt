package com.springboot.blog.payload

import java.sql.Date
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Size

data class CommentDto(
    var id: Long = 0,

    @field:NotEmpty(message = "Comment should not be empty")
    @field:Size(min = 2, message = "Comment body must be at least 2 characters")
    var body: String? = null,

    var createdBy: String? = null,

    var createDate: Date? = null,

    var lastModifiedBy: String? = null,

    var lastModifiedDate: String? = null,

    var userProfile: String? = null
)

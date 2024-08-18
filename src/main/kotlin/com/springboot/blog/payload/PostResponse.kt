package com.springboot.blog.payload

data class PostResponse(
    var content: List<PostPaginationResponse>? = null,
    var pageNo: Int = 0,
    var pageSize: Int = 0,
    var totalElements: Long = 0,
    var totalPages: Int = 0,
    var last: Boolean = false
)

package com.springboot.blog.entity

import jakarta.persistence.*
import java.util.HashSet


@Entity
@Table(name = "posts")
data class Post(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "title", nullable = false)
    val title: String,

    @Lob
    @Column(name = "description", nullable = false, length = 5000)
    val description: String,

    @Lob
    @Column(name = "image", nullable = false)
    val image: String,

    @Lob
    val userProfile: String? = null,

    @OneToMany(mappedBy = "post", cascade = [CascadeType.ALL], orphanRemoval = true)
    val comments: Set<Comment> = HashSet(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    val category: Category? = null

) : Auditable()

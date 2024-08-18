package com.springboot.blog.entity

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.Temporal
import jakarta.persistence.TemporalType
import java.util.Date
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener

/**
 *
 * @EntityListeners annotation-> This annotation basically enables JPA entity listener so that
 * changes to the entity values can be tracked.
 * @author Garvit
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open class Auditable {

    @CreatedBy var createdBy: String? = null

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @JsonFormat(pattern = "dd-MM-yyyy")
    var createDate: Date? = null

    @LastModifiedBy var lastModifiedBy: String? = null

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @JsonFormat(pattern = "dd-MM-yyyy")
    var lastModifiedDate: Date? = null
}

package com.wewk.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedBy
    @Column(updatable = false)
    private Long createMberNo;

    @CreatedBy
    @Column(updatable = false)
    private LocalDateTime createDt;

    @LastModifiedBy
    private Long modifiMberNo;

    @CreatedBy
    private LocalDateTime modifiDt;

}

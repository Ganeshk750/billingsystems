package com.ganesh.api.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="product_item")
public class ProductItem extends BaseObject {

    @Column(name="code", nullable = false)
    private String code;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    private Product product;
}

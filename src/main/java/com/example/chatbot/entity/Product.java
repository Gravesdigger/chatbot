package com.example.chatbot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    private String productDetail;

    @OneToMany(mappedBy = "product",cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private List<SpecialRecord> specialRecordList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public List<SpecialRecord> getSpecialRecordList() {
        return specialRecordList;
    }

    public void setSpecialRecordList(List<SpecialRecord> specialRecordList) {
        this.specialRecordList = specialRecordList;
    }
}

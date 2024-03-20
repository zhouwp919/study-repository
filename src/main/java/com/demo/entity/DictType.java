package com.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sys_dict_type")
public class DictType {
    /**
     * 序号
     */
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 字典名称
     */
    @Column(name = "dict_name")
    private String dictName;

    /**
     * 字典类型
     */
    @Column(name = "dict_type")
    private String dictType;

    /**
     * 字典类型描述
     */
    @Column(name = "dict_type_desc")
    private String dictTypeDesc;

    /**
     * 状态||停用,0,启用,1
     */
    @Column(name = "status", nullable = false)
    private Integer status;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

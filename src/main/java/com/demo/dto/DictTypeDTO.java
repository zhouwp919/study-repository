package com.demo.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class DictTypeDTO {
    /**
     * 序号
     */
    private Long id;


    /**
     * 字典名称
     */
    private String dictName;


    /**
     * 字典类型
     */
    private String dictType;


    /**
     * 字典类型描述
     */
    private String dictTypeDesc;


    /**
     * 状态||停用,0,启用,1
     */
    private Integer status;


    /**
     * 创建者编码
     */
    private String creatorId;


    /**
     * 创建者
     */
    private String creator;


    /**
     * 创建时间
     */
    private Date createdTime;


    /**
     * 更新者编码
     */
    private String updatorId;


    /**
     * 更新者
     */
    private String updator;


    /**
     * 更新时间
     */
    private Date updatedTime;


    /**
     * 删除标志||未删除,0,已删除,1
     */
    private Integer deleteFlag;


    /**
     * 数据版本号
     */
    private Long objectVersionNumber;
}

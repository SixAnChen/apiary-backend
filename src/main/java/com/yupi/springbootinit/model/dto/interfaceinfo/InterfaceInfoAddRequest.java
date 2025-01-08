package com.yupi.springbootinit.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 接口信息-创建请求
 */
@Data
public class InterfaceInfoAddRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 接口地址
     */
    private String url;
    /**
     * 请求头
     */
    private String requestHeader;
    /**
     * 响应头
     */
    private String responseHeader;
    /**
     * 请求类型
     */
    private String method;
}
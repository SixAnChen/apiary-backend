package com.yupi.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.springbootinit.model.dto.interfaceinfo.InterfaceInfoQueryRequest;
import com.yupi.springbootinit.model.entity.InterfaceInfo;
import com.yupi.springbootinit.model.vo.InterfaceInfoVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 接口信息相关服务接口
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    /**
     * 获取接口信息视图封装类
     *
     * @param interfaceInfo 接口消息
     * @param request       HttpServletRequest 请求
     * @return 接口信息视图封装类
     */
    InterfaceInfoVO getInterfaceInfoVO(InterfaceInfo interfaceInfo, HttpServletRequest request);

    /**
     * 获取查询条件
     *
     * @param interfaceInfoQueryRequest 接口信息查询请求
     * @return 查询封装类
     */
    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);

    /**
     * 分页获取接口信息封装类
     *
     * @param interfaceInfoPage 接口信息分页
     * @param request           HttpServletRequest 请求
     * @return 接口信息封装类分页
     */
    Page<InterfaceInfoVO> getInterfaceInfoVOPage(Page<InterfaceInfo> interfaceInfoPage, HttpServletRequest request);
}

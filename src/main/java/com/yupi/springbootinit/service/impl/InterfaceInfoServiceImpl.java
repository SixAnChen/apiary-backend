package com.yupi.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.springbootinit.mapper.InterfaceInfoMapper;
import com.yupi.springbootinit.model.entity.InterfaceInfo;
import com.yupi.springbootinit.service.InterfaceInfoService;
import org.springframework.stereotype.Service;

/**
 * 接口信息相关服务实现类
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
        implements InterfaceInfoService {
}





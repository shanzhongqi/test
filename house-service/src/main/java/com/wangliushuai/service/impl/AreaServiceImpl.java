package com.wangliushuai.service.impl;

import com.wangliushuai.entity.Area;
import com.wangliushuai.mapper.AreaMapper;
import com.wangliushuai.service.IAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 王留帅
 * @since 2020-06-20
 */
@Service
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements IAreaService {

    @Override
    public List<Area> selectArea() {
        return this.baseMapper.selectArea();
    }
}

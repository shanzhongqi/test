package com.szq.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.szq.entity.House;
import com.szq.entity.HouseVo;
import com.szq.mapper.HouseMapper;
import com.szq.service.IHouseService;
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
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements IHouseService {

    @Override
    public PageInfo<HouseVo> selects(HouseVo houseVo, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<HouseVo> selects = this.baseMapper.selects(houseVo);
        return new PageInfo<>(selects);
    }
}

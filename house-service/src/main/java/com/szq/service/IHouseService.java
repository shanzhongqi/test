package com.szq.service;

import com.github.pagehelper.PageInfo;
import com.szq.entity.House;
import com.baomidou.mybatisplus.extension.service.IService;
import com.szq.entity.HouseVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 王留帅
 * @since 2020-06-20
 */
public interface IHouseService extends IService<House> {

    PageInfo<HouseVo> selects(HouseVo houseVo,Integer pageNum,Integer pageSize);
}

package com.wangliushuai.mapper;

import com.wangliushuai.entity.House;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangliushuai.entity.HouseVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 王留帅
 * @since 2020-06-20
 */
public interface HouseMapper extends BaseMapper<House> {

    List<HouseVo> selects(HouseVo houseVo);
}

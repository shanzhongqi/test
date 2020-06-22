package com.szq.mapper;

import com.szq.entity.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 王留帅
 * @since 2020-06-20
 */
public interface AreaMapper extends BaseMapper<Area> {
   List<Area> selectArea();
}

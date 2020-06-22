package com.szq.service;

import com.szq.entity.Area;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 王留帅
 * @since 2020-06-20
 */
public interface IAreaService extends IService<Area> {
    List<Area> selectArea();
}

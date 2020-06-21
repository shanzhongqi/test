package com.wangliushuai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王留帅
 * @since 2020-06-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_area")
public class Area implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer pid;


}

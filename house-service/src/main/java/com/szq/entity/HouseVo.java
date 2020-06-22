package com.szq.entity;

import lombok.Data;

import java.util.List;

@Data
public class HouseVo extends  House{

    private Integer maxRoom;

    //虚拟接收租金
    private  String xrent;

    //租金范围1
    private  Integer rent1;
    //租金范围2
    private  Integer rent2;

    private List<Integer> ids;
}

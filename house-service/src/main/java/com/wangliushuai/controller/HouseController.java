package com.wangliushuai.controller;


import com.github.pagehelper.PageInfo;
import com.wangliushuai.entity.HouseVo;
import com.wangliushuai.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 王留帅
 * @since 2020-06-20
 */
@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private IHouseService iHouseService;

    @GetMapping("selects")
    public PageInfo<HouseVo> selects(HouseVo houseVo, @RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "3") Integer pageSize){
         if(houseVo.getRoom()!=null){
             if(houseVo.getRoom()==5){
                 houseVo.setMaxRoom(houseVo.getRoom());
             }
         }
        if(houseVo.getXrent()!=null){
            String[] split = houseVo.getXrent().split("-");
           for(int i=0 ;i<split.length;i++){

               houseVo.setRent1(Integer.parseInt(split[0]));
               houseVo.setRent2(Integer.parseInt(split[1]));
            }
        }
        System.out.println("getRent1"+houseVo.getRent1()+"xxxx"+"getRent2"+houseVo.getRent2());

        System.err.println("setMaxRoom"+houseVo.getMaxRoom());
        PageInfo<HouseVo> info = iHouseService.selects(houseVo, pageNum, pageSize);
          return info;
    }

    @PostMapping("save")
    public  boolean save (@RequestBody HouseVo houseVo){
        boolean b = iHouseService.saveOrUpdate(houseVo);
        return  b;
    }


    @PostMapping("delBatch")
    public  boolean delBatch (@RequestBody HouseVo houseVo){
       boolean b = iHouseService.removeByIds(houseVo.getIds());
        return  b;
    }

}

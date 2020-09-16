package com.currentbp.controller;

import com.currentbp.entity.MallItem;
import com.currentbp.entry.ResultData;
import com.currentbp.service.MallItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author baopan
 * @createTime 2020/8/9 16:47
 */

@RestController
@RequestMapping("/mallItem")
public class MallItemController {

    @Autowired
    private MallItemService mallItemService;

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public ResultData getMallItemById( Integer id) {
        System.out.println("===>id:"+id);
        MallItem mallItem = mallItemService.getById(id);
        return ResultData.successed(mallItem);
    }
}

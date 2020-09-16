package com.currentbp.service.impl;

import com.currentbp.mapper.MallItemMapper;
import com.currentbp.entity.MallItem;
import com.currentbp.service.MallItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author baopan
 * @createTime 2020/8/9 16:52
 */
@Service
public class MallItemServiceImpl implements MallItemService {

    @Autowired
    private MallItemMapper mallItemMapper;

    @Override
    public MallItem getById(Integer id) {
        return mallItemMapper.getById(id);
    }
}

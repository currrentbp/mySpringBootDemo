package com.currentbp.mapper;

import com.currentbp.entity.MallItem;
import org.springframework.stereotype.Repository;


@Repository
public interface MallItemMapper {

    MallItem getById(Integer id);
}

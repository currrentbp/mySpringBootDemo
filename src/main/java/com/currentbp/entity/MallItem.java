package com.currentbp.entity;

import java.io.Serializable;

/**
 * @author baopan
 * @createTime 2020/8/9 16:49
 */
public class MallItem implements Serializable {
    private static final long serialVersionUID = 4573500396491941476L;
    private Integer id;
    private String name;
    private String code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "MallItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

package com.wan51.provider.dao.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class BaseEntity {

    @TableId(value="id", type= IdType.AUTO)
    private Integer id;

}

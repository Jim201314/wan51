package com.wan51.provider.dao.test.service.impl;

import com.wan51.provider.dao.test.entity.Category;
import com.wan51.provider.dao.test.mapper.CategoryMapper;
import com.wan51.provider.dao.test.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author laobaozi
 * @since 2018-10-19
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}

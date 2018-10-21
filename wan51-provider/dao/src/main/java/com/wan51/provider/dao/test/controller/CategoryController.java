package com.wan51.provider.dao.test.controller;


import com.wan51.provider.dao.test.entity.Category;
import com.wan51.provider.dao.test.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author laobaozi
 * @since 2018-10-19
 */
@Controller
@RequestMapping("/test/category")
public class CategoryController {

    @Autowired
    ICategoryService categoryService;


    @RequestMapping(value = "/index")
    @ResponseBody
    public Object test() {
        List<Category> categories = categoryService.list(null);
        return categories;
    }


}

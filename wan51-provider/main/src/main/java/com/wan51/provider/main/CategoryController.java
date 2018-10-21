//package com.wan51.provider.main;
//
//
//import com.wan51.provider.dao.test.entity.Category;
//import com.wan51.provider.dao.test.service.ICategoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * <p>
// *  前端控制器
// * </p>
// *
// * @author laobaozi
// * @since 2018-10-19
// */
//@Controller
//@RequestMapping("/test/category")
//public class CategoryController {
//
//    @Autowired
//    ICategoryService categoryService;
//
//
//    @RequestMapping(value = "/index")
//    @ResponseBody
//    public Object test() {
//        List<Category> categories2 = categoryService.list(null);
//        List<Category> categories = new ArrayList<>();
//        Category category = new Category();
//        category.setDescription("tesd");
//        category.setName("ddd");
//        categories.add(category);
//        return categories2;
//    }
//
//
//}

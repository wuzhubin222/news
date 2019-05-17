package cn.news.controller;

import cn.news.pojo.news_category;
import cn.news.pojo.news_detail;
import cn.news.service.news_categoryService;
import cn.news.service.news_detailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/news")
public class newsController {
    @Resource
    private news_categoryService news_categoryService;
    @Resource
    private news_detailService news_detailService;

    @RequestMapping("/list")
    public String save(@RequestParam(value = "categoryid",required = false) Integer categoryid,
                       @RequestParam(value = "title",required = false) String title, Model model){

        List<news_detail> list1= news_detailService.querynews_detailid(categoryid,title);
         List<news_category> list2=news_categoryService.querynews_category();
         model.addAttribute("list1",list1);
        model.addAttribute("list2",list2);
        return "newsList";
    }
    @RequestMapping("/queryid")
    public  String queryid(@RequestParam(value = "id",required = false) Integer id,Model model){
            List<news_detail> list3 = news_detailService.savenews_detailid(id);
            model.addAttribute("list3",list3);
            return "/update";
    }

    @RequestMapping("/update")
    public  String update(news_detail news_detail){
     Integer sss = news_detailService.updatnews_detailid(news_detail);
     if(sss>0){
         return "redirect:/news/list";
     }else{
         return "/update";
     }
    }

}

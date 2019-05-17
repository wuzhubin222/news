package cn.news.service;

import cn.news.dao.news_categoryMapper;
import cn.news.pojo.news_category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("news_categoryService")
public class news_categoryServiceimpl implements news_categoryService {
    @Resource
    private news_categoryMapper news_categoryMapper;
    @Override
    public List<news_category> querynews_category() {
        return news_categoryMapper.querynews_category();
    }
}

package cn.news.dao;

import cn.news.pojo.news_category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface news_categoryMapper {
    List<news_category> querynews_category();
}

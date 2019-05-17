package cn.news.dao;

import cn.news.pojo.news_detail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface news_detailMapper {
    List<news_detail> querynews_detailid(@Param("categoryid") Integer categoryid, @Param("title") String title);

    List<news_detail> savenews_detailid(@Param("id") Integer id);

    int updatnews_detailid( news_detail news_detail);

}

package cn.news.service;

import cn.news.pojo.news_detail;


import java.util.List;

public interface news_detailService {
    List<news_detail> querynews_detailid( Integer categoryid, String title);

    List<news_detail> savenews_detailid( Integer id);

    int updatnews_detailid( news_detail news_detail);
}

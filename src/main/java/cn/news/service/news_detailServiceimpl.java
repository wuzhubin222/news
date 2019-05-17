package cn.news.service;

import cn.news.dao.news_detailMapper;
import cn.news.pojo.news_detail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("news_detailService")
public class news_detailServiceimpl implements news_detailService {
    @Resource
    private news_detailMapper news_detailMapper;
    @Override
    public List<news_detail> querynews_detailid(Integer categoryid, String title) {

        return news_detailMapper.querynews_detailid(categoryid,title);
    }

    @Override
    public List<news_detail> savenews_detailid(Integer id) {
        return news_detailMapper.savenews_detailid(id);
    }

    @Override
    public int updatnews_detailid(news_detail news_detail) {
        return news_detailMapper.updatnews_detailid(news_detail);
    }
}

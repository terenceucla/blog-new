package org.example.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.dao.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper extends BaseMapper<Tag> {
    List<Tag> findTagsByIds(List<Long> tagIds);

    List<Tag> findTagsByArticleId(Long articleId);

    List<Long> findHotsTagIds(int limit);
}

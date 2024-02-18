package com.zc.mapper;

import com.zc.pojo.Category;
import com.zc.pojo.Entry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.sql.Date;
import java.util.List;

@Mapper
public interface EntryMapper {
    List<Entry> getAll(@Param("type")String type);
    List<Category> getType();
    int addEntry(@Param("categoryId") int categoryId,
                 @Param("title")String title,
                 @Param("summary")String summary,
                 @Param("uploadUser")String uploadUser,
                 @Param("createDate") Date createDate);
    Entry getEntry(@Param("id")int id);
    int changeEntry(@Param("categoryId") int categoryId,
                 @Param("title")String title,
                 @Param("summary")String summary,
                 @Param("uploadUser")String uploadUser,
                 @Param("createDate") Date createDate,
    @Param("id")int id);

}

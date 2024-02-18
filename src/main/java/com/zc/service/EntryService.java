package com.zc.service;

import com.zc.pojo.Category;
import com.zc.pojo.Entry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntryService {
    List<Entry> getAll(String type);
    List<Category> getType();
    int add( Entry entry);
    int change( Entry entry,int id);
    Entry getEntry(int id);

}

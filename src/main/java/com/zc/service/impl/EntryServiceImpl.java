package com.zc.service.impl;

import com.zc.mapper.EntryMapper;
import com.zc.pojo.Category;
import com.zc.pojo.Entry;
import com.zc.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {
    @Resource
    private EntryMapper mapper;
    @Override
    public List<Entry> getAll(String type) {
        return mapper.getAll(type);
    }

    @Override
    public List<Category> getType() {
        return mapper.getType();
    }

    @Override
    public int add(Entry entry) {
        System.out.println(entry);
        return mapper.addEntry(entry.getCategory().getCid(),entry.getTitle(),
                entry.getSummary(),entry.getUploadUser(),entry.getCreateDate());
    }

    @Override
    public int change(Entry entry,int id) {
        return mapper.changeEntry(entry.getCategory().getCid(),entry.getTitle(),
                entry.getSummary(),entry.getUploadUser(),entry.getCreateDate(), id);
    }

    @Override
    public Entry getEntry(int id) {
        return mapper.getEntry(id);
    }
}

package com.zc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.pojo.Category;
import com.zc.pojo.Entry;
import com.zc.pojo.Result;
import com.zc.service.EntryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/entry")
public class EntryController {
    @Resource
    private EntryService service;

    @GetMapping("/{pageNum}/{size}")
    public Result getAll(@PathVariable int pageNum, @PathVariable int size,
                         @RequestParam("type") String type){
        PageHelper.startPage(pageNum,size);
        List<Entry> all = service.getAll(type);
        all.sort((b,a)->a.getId()-b.getId());
        PageInfo<Entry> pageInfo=new PageInfo<>(all,3);
        return new Result(200,pageInfo,"ok");
    }

    @GetMapping("/getType")
    public Result getType(){
        return new Result(200,service.getType(),null);
    }
    @PostMapping("/add/{cid}")
    public Result addEntry(@RequestBody Entry entry,@PathVariable("cid")int cid) {
        entry.setCategory(new Category(cid,null));
        service.add(entry);
        // 对entry进行处理
        return new Result(200, "ok", "ok");
    }

    @GetMapping("/getEntry")
    public Result getEntry(@RequestParam("id")int eid){
        return new Result(200,service.getEntry(eid),"ok");

    }

    @PostMapping("/change/{cid}")
    public Result ChangeEntry(@RequestBody Entry entry,@PathVariable("cid")int cid) {
        entry.setCategory(new Category(1,null));
        service.change(entry,cid);
        // 对entry进行处理
        return new Result(200, "ok", "ok");
    }
}

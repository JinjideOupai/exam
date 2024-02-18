package com.zc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry {
    private int id;
    private Category category;
    private String title;
    private String summary;
    private String uploadUser;
    private Date createDate;
}

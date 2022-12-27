package com.cms.domain.vo;

import com.cms.domain.model.Category;
import com.cms.domain.model.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;

}
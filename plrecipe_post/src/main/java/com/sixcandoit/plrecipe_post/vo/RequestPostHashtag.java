package com.sixcandoit.plrecipe_post.vo;

import com.sixcandoit.plrecipe_post.aggregate.Post;
import lombok.Data;

import java.util.List;

@Data
public class RequestPostHashtag {
    private Post post;
    private List<Integer> hashtagId;
}

package com.sixcandoit.plrecipe_post.vo;

import com.sixcandoit.plrecipe_post.aggregate.Post;
import com.sixcandoit.plrecipe_post.vo.member.ResponseMember;
import lombok.Data;

import java.util.List;

@Data
public class ResponsePostHashtag {
    private Post post;
    private List<Integer> hashtagId;
    private List<ResponseMember> member;
}

package com.caishu.service;

import com.caishu.pojo.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentByBlogId(Long blogId);

    List<Comment> findSecondaryCommentBySelfId(Long id);

    int saveComment(Comment comment);

    int deleteComment(Comment comment);
}

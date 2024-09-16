package com.web.oj.service;

import com.web.oj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.web.oj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.web.oj.model.entity.User;

/**
* @author 丁通
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-09-11 17:43:14
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 题目提交（内部服务）
     *
     * @param userId
     * @param questionId
     * @return
     */
    int doQuestionSubmitInner(long userId, long questionId);
}

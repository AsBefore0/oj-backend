package com.web.oj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.web.oj.model.entity.Question;
import com.web.oj.service.QuestionService;
import com.web.oj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author 丁通
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-09-11 17:41:32
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}





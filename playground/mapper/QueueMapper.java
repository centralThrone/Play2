package com.playground.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.playground.entity.Queue;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public interface QueueMapper extends BaseMapper<Queue> {

}
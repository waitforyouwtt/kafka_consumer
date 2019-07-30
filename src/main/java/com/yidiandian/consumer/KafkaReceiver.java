package com.yidiandian.consumer;
import com.alibaba.fastjson.JSON;
import com.yidiandian.entity.OmpActivity;
import com.yidiandian.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Author: 凤凰[小哥哥]
 * @Date: 2019/7/26 15:21
 * @Email: 15290810931@163.com
 */
@Component
@Slf4j
public class KafkaReceiver {

    @Autowired
    ActivityService activityService;

    @KafkaListener(topics = {"FH-Borther"})
    public void listen(ConsumerRecord<?,?> record){
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()){
            Object message =  kafkaMessage.get();
            OmpActivity ompActivity = JSON.parseObject(message.toString(), OmpActivity.class);
            log.info("得到的结果：{}",ompActivity);
           //插入到暂存表数据
           activityService.insertActivity(ompActivity);
        }
    }


}

package com.nivtek.quoteinfo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.ektha.quote.driverinfo.model.Driver;

@Service
public class Receiver {
	
	@KafkaListener(topics = "${app.topic.foo}")
    public void listen(@Payload Driver driver,
    		@Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
		
		
		System.out.println(String.format("Received message from partition %d = %s", partition,driver));
    }

}

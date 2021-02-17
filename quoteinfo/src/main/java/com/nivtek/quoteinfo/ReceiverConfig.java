package com.nivtek.quoteinfo;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.ektha.quote.driverinfo.model.Driver;

@Configuration
@EnableKafka
public class ReceiverConfig {
	
	
	 @Value("${spring.kafka.bootstrap-servers}")
	    private String bootstrapServers;

	    @Bean
	    public Map<String, Object> consumerConfigs() {
	        Map<String, Object> props = new HashMap<>();
	        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
	        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
	        props.put(ConsumerConfig.GROUP_ID_CONFIG, "QuoteProcessingGroup");
	        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
	        props.put(JsonDeserializer.TRUSTED_PACKAGES, "*");
//	        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
	        
//	        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, ErrorHandlingDeserializer2.class);
//	        props.put(ErrorHandlingDeserializer2.VALUE_DESERIALIZER_CLASS, JsonDeserializer.class.getName());
	        return props;
	    }

	    @Bean
	    public ConsumerFactory<String, Driver> consumerFactory() {
	        return new DefaultKafkaConsumerFactory<String, Driver>(consumerConfigs(), new StringDeserializer(),new JsonDeserializer<>(Driver.class));
	    }

	    @Bean
	    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, Driver>> kafkaListenerContainerFactory() {
	        ConcurrentKafkaListenerContainerFactory<String, Driver> factory = new ConcurrentKafkaListenerContainerFactory<>();
	        factory.setConsumerFactory(consumerFactory());
	        factory.getContainerProperties().setPollTimeout(3000);
	        return factory;
	    }

}

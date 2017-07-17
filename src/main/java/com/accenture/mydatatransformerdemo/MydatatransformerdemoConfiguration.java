package com.accenture.mydatatransformerdemo;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;


@EnableBinding(Processor.class)
public class MydatatransformerdemoConfiguration {

	@Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	public int convertToCelsius(String payload) {
		       int farenheitTemperature = Integer.parseInt(payload);
		       return (farenheitTemperature-30)/2;
		    }
}

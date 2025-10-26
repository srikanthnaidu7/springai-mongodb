package com.springai.mongodb;

import com.springai.mongodb.tools.EmployeeMCPService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringaiMongodbApplication {
//Test
	public static void main(String[] args) {
		SpringApplication.run(SpringaiMongodbApplication.class, args);
	}

    @Bean
    public List<ToolCallback> employeeToolCallback(EmployeeMCPService employeeMCPService){
        return List.of(ToolCallbacks.from(employeeMCPService));
    }

}

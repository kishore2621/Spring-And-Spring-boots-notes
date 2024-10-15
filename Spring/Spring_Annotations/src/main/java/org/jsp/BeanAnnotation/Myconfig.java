package org.jsp.BeanAnnotation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.jsp.BeanAnnotation")
public class Myconfig 
{
	@Bean
	public List<String> empnames()
	{
		return Arrays.asList("Abc","pqr","xyz");
	}

	@Bean("managernames")
	public List<String> getList()
	{
		return Arrays.asList("Abc","pqr","xyz");
	}
	
}

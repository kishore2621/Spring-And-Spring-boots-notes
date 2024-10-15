package org.jsp.SpringAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("pratice.property")
@Configuration
@ComponentScan("org.jsp.SpringAnnotations")

public class Myconfig 
{

}

package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy//(proxyTargetClass = true)
@ComponentScan(basePackageClasses = Config.class)
public class Config {}

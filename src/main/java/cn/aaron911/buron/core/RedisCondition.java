package cn.aaron911.buron.core;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;

public class RedisCondition implements Condition{
	
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 获取bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 从容器中获取RedisTemplate类型bean
        Map<String, RedisTemplate> map = beanFactory.getBeansOfType(RedisTemplate.class);
        // 当容器中不存在RedisTemplate 才实例化
        if (map.isEmpty() && "redis".equals(context.getEnvironment().getProperty("aaron911.buron.type"))) {
        	return true;
        }
		return false;
	}

}

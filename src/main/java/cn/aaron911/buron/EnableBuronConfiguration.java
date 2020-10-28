package cn.aaron911.buron;

import cn.aaron911.buron.core.BuronAutoConfiguration;
import cn.aaron911.buron.listener.LogoApplactionListener;
import cn.aaron911.buron.property.BuronProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * spring 中使用 @Import({cn.aaron911.buron.EnableBuronConfiguration.class}) 
 * 
 * 
 */
@Configuration
@Import({BuronAutoConfiguration.class, BuronProperty.class, LogoApplactionListener.class})
public class EnableBuronConfiguration {
	
	

}

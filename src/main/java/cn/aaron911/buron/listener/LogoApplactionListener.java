package cn.aaron911.buron.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class LogoApplactionListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger log = LoggerFactory.getLogger(LogoApplactionListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        String LOGO = "Buron~!";
    	String bannerText = System.getProperty("line.separator") + LOGO  + System.getProperty("line.separator");
        if (log.isDebugEnabled()) {
            log.debug(bannerText);
        }
    }
}

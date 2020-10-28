package cn.aaron911.buron.core;

import javax.servlet.http.HttpServletRequest;


public interface IBuronProcessor {

    BuronResponse process(HttpServletRequest request);
}

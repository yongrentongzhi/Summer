package com.summer.core;

import com.summer.annotation.ComponentScan;

import java.lang.annotation.Annotation;

/**
 * @author 余涛
 */
public class ApplicationContext {

    private Class configClass;

    public ApplicationContext(Class configClass) {
        this.configClass = configClass;
//       解析ComponentScan注解
        ComponentScan componentScan = (ComponentScan) configClass.getDeclaredAnnotation(ComponentScan.class);
        String path = componentScan.value();
    }


}

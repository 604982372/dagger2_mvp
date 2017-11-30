package cn.xiwu.daggerdemo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by xiwu on 2017/11/29.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope
{
}

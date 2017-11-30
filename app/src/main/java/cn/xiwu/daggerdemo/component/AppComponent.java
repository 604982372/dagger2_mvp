package cn.xiwu.daggerdemo.component;

import android.app.Application;

import javax.inject.Singleton;

import cn.xiwu.daggerdemo.module.AppModule;
import cn.xiwu.daggerdemo.MyApplication;
import cn.xiwu.daggerdemo.bean.Teacher;
import dagger.Component;

/**
 * Created by xiwu on 2017/11/29.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MyApplication demoApplication);
    Teacher getTeacher();
    Application getApplication();
}

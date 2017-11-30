package cn.xiwu.daggerdemo.module;

import android.app.Application;
import android.content.Context;

import cn.xiwu.daggerdemo.annotation.ApplicationContext;
import cn.xiwu.daggerdemo.bean.Teacher;
import dagger.Module;
import dagger.Provides;

/**
 * Created by xiwu on 2017/11/29.
 */

@Module
public class AppModule {

    private final Application mApplication;

    public AppModule(Application app) {
        mApplication = app;
    }

    @Provides
    Teacher provideTeacher() {
        Teacher teacher = new Teacher();
        teacher.setId("1");
        teacher.setName("xiwu");
        teacher.setAge("18");
        return teacher;
    }
    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

}
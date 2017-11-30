package cn.xiwu.daggerdemo;

import android.app.Application;
import android.content.Context;

import cn.xiwu.daggerdemo.component.AppComponent;
import cn.xiwu.daggerdemo.component.DaggerAppComponent;
import cn.xiwu.daggerdemo.module.AppModule;

/**
 * Created by zuzu on 2017/11/29.
 */

public class MyApplication extends Application
{
    protected AppComponent applicationComponent;


    public static MyApplication get(Context context)
    {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate()
    {
        super.onCreate();
        applicationComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public AppComponent getComponent()
    {
        return applicationComponent;
    }
}

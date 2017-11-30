package cn.xiwu.daggerdemo.module;

import cn.xiwu.daggerdemo.annotation.ActivityScope;
import cn.xiwu.daggerdemo.bean.Teacher;
import cn.xiwu.daggerdemo.presenter.MainPresenter;
import cn.xiwu.daggerdemo.ui.MainActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by xiwu on 2017/11/29.
 */
@Module
public class MainActivityModule
{
    private MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Provides
    @ActivityScope
    MainActivity provideMainActivity() {
        return mainActivity;
    }


    @Provides
    @ActivityScope
    MainPresenter provideMainActivityPresenter(MainActivity mainActivity, Teacher teacher) {
        return new MainPresenter(mainActivity, teacher);
    }

}

package cn.xiwu.daggerdemo.component;


import cn.xiwu.daggerdemo.annotation.ActivityScope;
import cn.xiwu.daggerdemo.module.MainActivityModule;
import cn.xiwu.daggerdemo.presenter.MainPresenter;
import cn.xiwu.daggerdemo.ui.MainActivity;
import dagger.Component;

@ActivityScope
@Component(modules = MainActivityModule.class,dependencies = AppComponent.class)
public interface MainActivityComponent
{
    MainActivity inject(MainActivity mainActivity);

    MainPresenter presenter();


}

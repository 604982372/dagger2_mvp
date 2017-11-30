package cn.xiwu.daggerdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import cn.xiwu.daggerdemo.MyApplication;
import cn.xiwu.daggerdemo.R;
import cn.xiwu.daggerdemo.component.DaggerMainActivityComponent;
import cn.xiwu.daggerdemo.component.MainActivityComponent;
import cn.xiwu.daggerdemo.module.MainActivityModule;
import cn.xiwu.daggerdemo.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity
{
    @InjectView(R.id.name)
    TextView mNameTv;
    @InjectView(R.id.age)
    TextView mAgeTv;
    @InjectView(R.id.id)
    TextView mIdTv;
    @Inject
    MainPresenter mMainPresenter;
    private MainActivityComponent mMainActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent();
        ButterKnife.inject(this);
        mMainPresenter.showInfo();
    }

    protected MainActivityComponent getActivityComponent()
    {
        if (mMainActivityComponent == null)
        {
            DaggerMainActivityComponent.builder()
                    .appComponent(MyApplication.get(this).getComponent())
                    .mainActivityModule(new MainActivityModule(this))
                    .build()
                    .inject(this);
        }
        return mMainActivityComponent;
    }

    public void setInfo(String name, String age, String id)
    {
        mNameTv.setText("名字：" + name);
        mAgeTv.setText("名年龄：" + age);
        mIdTv.setText("id：" + id);
    }
}

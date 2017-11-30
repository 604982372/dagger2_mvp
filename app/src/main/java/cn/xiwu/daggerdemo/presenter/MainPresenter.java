package cn.xiwu.daggerdemo.presenter;

import cn.xiwu.daggerdemo.ui.MainActivity;
import cn.xiwu.daggerdemo.bean.Teacher;

/**
 * Created by xiwu on 2017/11/29.
 */

public class MainPresenter
{
    private MainActivity mMainActivity;
    private Teacher mTeacher;

    public MainPresenter(MainActivity mainActivity, Teacher teacher)
    {
        this.mMainActivity = mainActivity;
        this.mTeacher = teacher;
    }

    public void showInfo()
    {
        mMainActivity.setInfo(mTeacher.getName(), mTeacher.getAge(), mTeacher.getId());
    }
}

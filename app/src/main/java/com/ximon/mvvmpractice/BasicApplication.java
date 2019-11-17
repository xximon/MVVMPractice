package com.ximon.mvvmpractice;

import android.app.Application;

/**
 * Created by XIMON on 2019-11-18
 */
public class BasicApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    /**
     * 구글 플레이 스토어 앱 배포 버전 체크
     *
     * @param packageName
     */
    private void checkAppVersion(String packageName) {

    }
}

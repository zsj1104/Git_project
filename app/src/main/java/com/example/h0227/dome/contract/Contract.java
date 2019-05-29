package com.example.h0227.dome.contract;

import com.example.h0227.dome.bean.Bean;

public interface Contract {
    interface Model {
        void getData(CallBack callBack);
    }

    interface View {
        void succeed(Bean bean);
        void failed(String s);
    }

    interface Presenter {
        void getData();
    }
    interface CallBack{
        void succeed(Bean bean);
        void failed(String s);
    }
}

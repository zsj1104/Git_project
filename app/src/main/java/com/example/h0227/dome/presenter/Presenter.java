package com.example.h0227.dome.presenter;

import com.example.h0227.dome.bean.Bean;
import com.example.h0227.dome.contract.Contract;

public class Presenter implements Contract.Presenter, Contract.CallBack {
    private Contract.Model model;
    private Contract.View view;

    public Presenter(Contract.Model model, Contract.View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void getData() {
        model.getData(this);
    }

    @Override
    public void succeed(Bean bean) {
        view.succeed(bean);
    }

    @Override
    public void failed(String s) {
        view.failed(s);
    }
}

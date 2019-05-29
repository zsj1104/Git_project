package com.example.h0227.dome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.example.h0227.dome.adapter.XrlAdapter;
import com.example.h0227.dome.bean.Bean;
import com.example.h0227.dome.contract.Contract;
import com.example.h0227.dome.model.Model;
import com.example.h0227.dome.presenter.Presenter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private XRecyclerView xrl;
    private ArrayList<Bean.ResultsBean> list;
    private XrlAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        new Presenter(new Model(),this).getData();
    }

    private void initView() {
        xrl = (XRecyclerView) findViewById(R.id.xrl);
        list = new ArrayList<>();
        xrl.setLayoutManager(new LinearLayoutManager(this));
        adapter = new XrlAdapter(list, this);
        xrl.setAdapter(adapter);

    }

    @Override
    public void succeed(Bean bean) {
        list.addAll(bean.getResults());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void failed(String s) {

    }
}

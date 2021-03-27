package com.example.tablayouttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewPager = findViewById(R.id.viewpager);
        initViewPager();
    }

    private void initViewPager(){
        TabLayout tabLayout = findViewById(R.id.tabs);
        List<String> titles = new ArrayList<>();
        titles.add("精选");
        titles.add("体育");
        titles.add("巴萨");
        titles.add("购物");
        titles.add("明星");
        titles.add("视频");
        titles.add("健康");
        titles.add("励志");
        titles.add("图文");
        titles.add("本地");
        titles.add("动漫");
        titles.add("搞笑");
        titles.add("精选");

        for(int i = 0; i < titles.size(); i++){
            tabLayout.addTab(tabLayout.newTab().setText(titles.get(i)));
        }

        List<Fragment> fragments = new ArrayList<>();
        for(int i = 0; i < titles.size(); i++){
            fragments.add(new ListFragment());
        }

        FragmentAdapter fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments, titles);
        //给ViewPager设置适配器
        viewPager.setAdapter(fragmentAdapter);
        //将TabLayout和ViewPager关联起来。
        tabLayout.setupWithViewPager(viewPager);
        //给TabLayout设置适配器
        tabLayout.setTabsFromPagerAdapter(fragmentAdapter);


    }
}
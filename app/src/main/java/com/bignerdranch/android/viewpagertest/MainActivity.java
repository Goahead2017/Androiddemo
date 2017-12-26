package com.bignerdranch.android.viewpagertest;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private ViewPager pager;
    private TabLayout tabLayout;
    private List<Fragment> fragList = new ArrayList<>();
    private List<String>titleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragList.add(new Fragment1());
        fragList.add(new Fragment2());
        fragList.add(new Fragment3());
        fragList.add(new Fragment4());

        titleList= new ArrayList<>();
        titleList.add("第一个Tab");
        titleList.add("第二个Tab");
        titleList.add("第三个Tab");
        titleList.add("第四个Tab");

        pager= findViewById(R.id.pager);
        tabLayout=findViewById(R.id.tab);

        tabLayout.addTab(tabLayout.newTab().setText(titleList.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(titleList.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(titleList.get(2)));
        tabLayout.addTab(tabLayout.newTab().setText(titleList.get(3)));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        MyFragmentPagerAdapter adapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),fragList,titleList);
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
    }
}

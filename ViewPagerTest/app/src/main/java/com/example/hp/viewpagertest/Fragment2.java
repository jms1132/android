package com.example.hp.viewpagertest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private TextView textView;
    private View view;

    //뷰페이저를 통해서 슬라이딩이나 탭키를 눌러서 뷰페이저 프레그먼트가 변경이 되려면,
    //이 현재 프레그먼트 상태를 저장하는 변수가 필요하다.

    public static Fragment2 newInstance(){
        Fragment2 fragment2 = new Fragment2(); //싱글톤과 같은 기능
        return fragment2;
    }

    @Nullable
    @Override //onCreate() 와 같은 기능을 한다. // 자동으로 콜백함수처럼 불러지게 된다.
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment2, container, false);
        textView = view.findViewById(R.id.textView);
        return view;
    }
}
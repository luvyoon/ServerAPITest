package kr.tjeit.serverapitest;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private android.widget.TextView userNameTxt
;
    private android.widget.TextView userIdTxt;
    private android.widget.TextView userEmailTxt;
    private android.widget.TextView userPhoneTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bindViews();
        setEvents();
        setEvents();
    }

    @Override
    public void setEvents() {

    }

    @Override
    public void setValues() {

        String loginid = getIntent().getStringExtra("로그인아이디");
        String loginEmail = getIntent().getStringExtra("이메일");
        String loginName = getIntent().getStringExtra("이름");
        String loginPhone = getIntent().getStringExtra("폰번");

        userNameTxt.setText(loginid);
        userEmailTxt.setText(loginEmail);
        userNameTxt.setText(loginName);
        userPhoneTxt.setText(loginPhone);


    }

    @Override
    public void bindViews() {

        this.userPhoneTxt = (TextView) findViewById(R.id.userPhoneTxt);
        this.userEmailTxt = (TextView) findViewById(R.id.userEmailTxt);
        this.userIdTxt = (TextView) findViewById(R.id.userIdTxt);
        this.userNameTxt = (TextView) findViewById(R.id.userNameTxt);

    }
}

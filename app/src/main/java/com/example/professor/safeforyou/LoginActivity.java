package com.example.professor.safeforyou;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.ui.view.OAuthLoginButton;


public class LoginActivity extends AppCompatActivity{
    private OAuthLogin mOAuthLoginModule;
    private TextView txt;


    private String OAUTH_CLIENT_ID = "HLANe8NVLuLqW9wtE7vS";
    private String OAUTH_CLIENT_SECRET = "9KTxkRLV1a";
    private String OAUTH_CLIENT_NAME = "";

    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;


        mOAuthLoginModule = OAuthLogin.getInstance();
        mOAuthLoginModule.init(
                LoginActivity.this
                , OAUTH_CLIENT_ID
                , OAUTH_CLIENT_SECRET
                , OAUTH_CLIENT_NAME
        );

        OAuthLoginButton mOAuthLoginButton = (OAuthLoginButton) findViewById(R.id.buttonOAuthLoginImg);
        mOAuthLoginButton.setOAuthLoginHandler(mOAuthLoginHandler);

        txt = (TextView)findViewById(R.id.textView);

    }

    private OAuthLoginHandler mOAuthLoginHandler = new OAuthLoginHandler() {
        @Override
        public void run(boolean success) {
            if (success) {

                //로그인 성공시 처리해야 할것들
            }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.buttonOAuthLoginImg) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

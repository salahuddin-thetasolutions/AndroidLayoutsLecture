package solutions.theta.androidlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    EditText mUserName,mPassword;
    Button mLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mUserName=(EditText) findViewById(R.id.etUserName);
        mPassword=(EditText) findViewById(R.id.etPassword);
        mLogin=(Button)findViewById(R.id.btnLogin);
        mLogin.setOnClickListener(this);
        mSignup.
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "login", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "signup", Toast.LENGTH_SHORT).show();
    }
}

package jp.techacademy.sachio.suenaga.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("sachio", 38,"fishing"); //インスタンスを作る


        human.say();

        human.think();
    }
}

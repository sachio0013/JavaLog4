package jp.techacademy.sachio.suenaga.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    //コメント
    static String to_jp = "私";

    //メンバ変数
    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これはhumanクラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。" + "歳は" + this.age + "歳です。");

    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");


    }
}
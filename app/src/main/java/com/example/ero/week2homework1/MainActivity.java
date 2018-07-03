package com.example.ero.week2homework1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<Menyu> menyuslist = new ArrayList<>();
        Menyu menyu = new Menyu();
        menyu.setText("Вы когда-нибудь задавались вопросом, чем накормить детей на празднике? Скажем, на дне рождении...");
        menyu.setTitle("Детская пицца");
        menyu.setKaloria("пицца");
        menyu.setImageUrl("https://recipes.timesofindia.com/photo/53110049.cms");
        menyu.setMenyuUrl("https://vkusno-i-prosto.ru/receipt/detskaya-picca/");

        Menyu menyu1 = new Menyu();
        menyu1.setText("Тесто разделите на кусочки, сформируйте из них шарики и раскатайте каждый в тонкую лепешку...");
        menyu1.setTitle("Ламаджо, армянская пицца");
        menyu1.setKaloria("ИНГРЕДИЕНТЫ");
        menyu1.setImageUrl("https://food.buy.am/uploads/zoom/2018/05/Lahmajo%20Lebanon.jpg");
        menyu1.setMenyuUrl("http://healthmenu.ru/recipe/lamadzho/");

        Menyu menyu2 = new Menyu();
        menyu2.setText("Вкуснейшие в Кемерово шашлыки, сочные нежные ароматные из свиной шейки, из барашка или теляти...");
        menyu2.setTitle("ШАШЛЫК !!! ");
        menyu2.setKaloria("ДОСТАВКА");
        menyu2.setImageUrl("http://i.630-717.ru/u/11/ac418ccbf311e592bbfeae14ba3547/-/image.jpg");
        menyu2.setMenyuUrl("http://630-717.ru/shashlykov-dostavka-kemerovo");

        Menyu menyu3 = new Menyu();
        menyu3.setText("Способ приготовления теста: Молоко разбавить тёплой водой. Взять 100 г получившейся смеси ...");
        menyu3.setTitle("Хачапури");
        menyu3.setKaloria("МАТЕРИАЛЫ");
        menyu3.setImageUrl("https://i.pinimg.com/originals/a3/76/93/a37693c78c14cf455eb5edcebca92faa.jpg");
        menyu3.setMenyuUrl("https://www.gastronom.ru/recipe/39941/hachapuri-po-imeretinski");

        Menyu menyu4 = new Menyu();
        menyu4.setText("Каждая хозяйка, обладая минимальным набором продуктов и 20 минутами времени, сможет....");
        menyu4.setTitle("Шаурма");
        menyu4.setKaloria("Быстрый");
        menyu4.setImageUrl("http://cfs.4geo.ru/get/market/product/img-1142013291_17556095611106508.jpeg");
        menyu4.setMenyuUrl("https://ru.wikipedia.org/wiki/%D0%A8%D0%B0%D1%83%D1%80%D0%BC%D0%B0");

        menyuslist.add(menyu);
        menyuslist.add(menyu1);
        menyuslist.add(menyu2);
        menyuslist.add(menyu3);
        menyuslist.add(menyu4);
        menyuslist.add(menyu);
        menyuslist.add(menyu1);
        menyuslist.add(menyu2);
        menyuslist.add(menyu3);
        menyuslist.add(menyu4);

        final MenyuAdapter menyuAdapter = new MenyuAdapter(this, R.layout.conteint_main, menyuslist);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(menyuAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(menyuslist.get(position).getMenyuUrl()));
                startActivity(intent);
            }
        });
    }
}

package com.example.emanuelle.constraitlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textData = findViewById(R.id.textData);
        textData.setText("14/02/2018");

        String descricao = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. " +
                "           Qui dicta minus molestiae vel beatae natus eveniet ratione temporibus " +
                "           aperiam harum alias officiis assumenda officia quibusdam deleniti eos cupiditate dolore doloribus";

        TextView textDescricao = findViewById(R.id.textDescr);
        textDescricao.setText(descricao);

        TextView textAutor = findViewById(R.id.textAutor);
        textAutor.setText("Emanuelle Rizzuto");



    }
}

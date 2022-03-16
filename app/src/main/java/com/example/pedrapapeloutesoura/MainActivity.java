package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickPedra(View view) {
        jogo(0);
    }

    public void clickPapel(View view) {
        jogo(1);
    }

    public void clickTesoura(View view) {
        jogo(2);
    }


    public void jogo(int sinal) {
        int sinalApp = new Random().nextInt(3);
        ImageView i = findViewById(R.id.imvEscolhaApp);
        TextView t = findViewById(R.id.txtResultado);
        int[] imagens = {R.drawable.pedra, R.drawable.papel, R.drawable.tesoura};
        i.setImageResource(imagens[sinalApp]);

        if ((sinalApp == 0 && sinal == 1)|| (sinalApp == 1 && sinal == 2) || (sinalApp == 2 && sinal == 0)) {
            t.setText("Você venceu, Parabéns!") ;
        } else if ((sinalApp == 0 && sinal == 2) || (sinalApp == 2 && sinal == 1) || (sinalApp == 1 && sinal == 0)) {
            t.setText("Você Perdeu!");
        }  else {
            //Empate do jogo.
            t.setText("Jogo Empatado!");
        }
    }
}

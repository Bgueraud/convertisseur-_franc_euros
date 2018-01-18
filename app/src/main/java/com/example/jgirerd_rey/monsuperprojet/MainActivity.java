package com.example.jgirerd_rey.monsuperprojet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_convertir = findViewById(R.id.button);
        final TextView franc = findViewById(R.id.franc);
        final TextView euros = findViewById(R.id.euros);

        // on créer la fonction qui sera appelé lorsqu'on clic sur le bouton
        button_convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                // initialisation des valeurs
                double taux = 6.55957;
                double franc_number = 0;
                double resultat = 0;

                // on lit la valeur du champ franc s'il n'est pas vide
                if (!String.valueOf(franc.getText()).isEmpty()) {
                    franc_number = Double.parseDouble(String.valueOf(franc.getText()));
                }

                // on fait la conversion
                resultat = franc_number / taux;

                // on affiche le résultat :)
                euros.setText(String.valueOf(resultat));
            }
        });
    }
}

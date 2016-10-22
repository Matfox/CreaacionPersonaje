package ga.leliadoura.dam2.creacionpersonaje;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String fuerza1, fuerza2, percepcion1, percepcion2, resistencia1, resistencia2, carisma1, carisma2, inteligencia1, inteligencia2, agilidad1, agilidad2, suerte1, suerte2, nom, sexo, complemento, compArma, compCom, compMed;
    int i, a, b, c, d, e, f, g, a1, b1, c1, d1, e1, f1, g1;

    TextView text, text1, text2, text3, text4, text5, text6, text7, sumafuerza, sumapercepcion, sumaresistencia, sumacarisma, sumainteligencia, sumaagilidad, sumasuerte;
    EditText nombre;
    RadioGroup grupo;
    RadioButton hombre, mujer;
    CheckBox arma, compañero, medicina;
    Button quitarfuerza, aumentarfuerza, quitarpercepcion, aumentarpercepcion, quitarresistencia, aumentarresistencia, quitarcarisma, aumentarcarisma, quitarinteligencia, aumentarinteligencia, quitaragilidad, aumentaragilidad, quitarsuerte, aumentarsuerte, resumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.restantes);
        text1 = (TextView) findViewById(R.id.fuerzaasignada);
        text2 = (TextView) findViewById(R.id.percepcionasignada);
        text3 = (TextView) findViewById(R.id.resistenciaasignada);
        text4 = (TextView) findViewById(R.id.carismaasignada);
        text5 = (TextView) findViewById(R.id.inteligenciaasignada);
        text6 = (TextView) findViewById(R.id.agilidadasignada);
        text7 = (TextView) findViewById(R.id.suerteasignada);
        sumafuerza = (TextView) findViewById(R.id.sumafuerza);
        sumapercepcion = (TextView) findViewById(R.id.sumapercepcion);
        sumaresistencia = (TextView) findViewById(R.id.sumaresistencia);
        sumacarisma = (TextView) findViewById(R.id.sumacarisma);
        sumainteligencia = (TextView) findViewById(R.id.sumainteligencia);
        sumaagilidad = (TextView) findViewById(R.id.sumaagilidad);
        sumasuerte = (TextView) findViewById(R.id.sumasuerte);

        nombre = (EditText) findViewById(R.id.cuadronombre);
        grupo = (RadioGroup) findViewById(R.id.gruposexo);
        hombre = (RadioButton) findViewById(R.id.hombre);
        mujer = (RadioButton) findViewById(R.id.mujer);

        arma = (CheckBox) findViewById(R.id.arma);
        compañero = (CheckBox) findViewById(R.id.compañero);
        medicina = (CheckBox) findViewById(R.id.medicina);

        quitarfuerza = (Button) findViewById(R.id.masfuerza);
        aumentarfuerza = (Button) findViewById(R.id.menosfuerza);
        quitarpercepcion = (Button) findViewById(R.id.maspercepcion);
        aumentarpercepcion = (Button) findViewById(R.id.menospercepcion);
        quitarresistencia = (Button) findViewById(R.id.masresistencia);
        aumentarresistencia = (Button) findViewById(R.id.menosresistencia);
        quitarcarisma = (Button) findViewById(R.id.mascarisma);
        aumentarcarisma = (Button) findViewById(R.id.menoscarisma);
        quitarinteligencia = (Button) findViewById(R.id.masinteligencia);
        aumentarinteligencia = (Button) findViewById(R.id.menosinteligencia);
        quitaragilidad = (Button) findViewById(R.id.masagilidad);
        aumentaragilidad = (Button) findViewById(R.id.menosagilidad);
        quitarsuerte = (Button) findViewById(R.id.massuerte);
        aumentarsuerte = (Button) findViewById(R.id.menossuerte);
        resumen = (Button) findViewById(R.id.resumen);

        fuerza1 = String.valueOf(text.getText());
        fuerza2 = String.valueOf(text1.getText());
        i = Integer.parseInt(fuerza1);
        a = Integer.parseInt(fuerza2);

        View.OnClickListener clickFuerza1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    if (a == 10)
                        sumafuerza.layout(0, 0, 256, 98);
                    if (a < 10) {
                        sumafuerza.setText("(+" + String.valueOf(a) + ")");
                        sumafuerza.setVisibility(View.VISIBLE);

                        a++;

                        i--;
                        text.setText((String.valueOf(i)));
                        text1.setText(String.valueOf(a));

                    }

                }
            }
        };
        quitarfuerza.setOnClickListener(clickFuerza1);

        fuerza1 = String.valueOf(text.getText());
        fuerza2 = String.valueOf(text1.getText());
        i = Integer.parseInt(fuerza1);
        a = Integer.parseInt(fuerza2);

        View.OnClickListener clickFuerza2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 21) {
                    if (a > 1) {
                        a--;
                        a1 = a - 1;
                        if (a1 > 0) {
                            sumafuerza.setText("(+" + String.valueOf(a1) + ")");
                            sumafuerza.setVisibility(View.VISIBLE);
                        } else
                            sumafuerza.setVisibility(View.INVISIBLE);
                        i++;
                        text.setText((String.valueOf(i)));
                        text1.setText((String.valueOf(a)));
                    }
                }
            }
        };
        aumentarfuerza.setOnClickListener(clickFuerza2);

        percepcion1 = String.valueOf(text.getText());
        percepcion2 = String.valueOf(text2.getText());
        i = Integer.parseInt(percepcion1);
        b = Integer.parseInt(percepcion2);

        View.OnClickListener clickPercepcion1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    if (b < 10) {
                        sumapercepcion.setText("(+" + String.valueOf(b) + ")");
                        b++;
                        i--;
                        text.setText((String.valueOf(i)));
                        text2.setText((String.valueOf(b)));
                    }
                }
            }
        };
        quitarpercepcion.setOnClickListener(clickPercepcion1);

        percepcion1 = String.valueOf(text.getText());
        percepcion2 = String.valueOf(text2.getText());
        i = Integer.parseInt(percepcion1);
        b = Integer.parseInt(percepcion2);

        View.OnClickListener clickPercepcion2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 21) {
                    if (b > 1) {

                        b--;
                        sumapercepcion.setText("(+" + String.valueOf(b) + ")");
                        i++;
                        text.setText((String.valueOf(i)));
                        text2.setText((String.valueOf(b)));
                    }
                }
            }
        };
        aumentarpercepcion.setOnClickListener(clickPercepcion2);

        resistencia1 = String.valueOf(text.getText());
        resistencia2 = String.valueOf(text3.getText());
        i = Integer.parseInt(resistencia1);
        c = Integer.parseInt(resistencia2);

        View.OnClickListener clickResistencia1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    if (c < 10) {
                        sumaresistencia.setText("(+" + String.valueOf(c) + ")");
                        c++;
                        i--;
                        text.setText((String.valueOf(i)));
                        text3.setText((String.valueOf(c)));
                    }
                }
            }
        };
        quitarresistencia.setOnClickListener(clickResistencia1);

        resistencia1 = String.valueOf(text.getText());
        resistencia2 = String.valueOf(text3.getText());
        i = Integer.parseInt(resistencia1);
        c = Integer.parseInt(resistencia2);

        View.OnClickListener clickResistencia2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 21) {
                    if (c > 1) {
                        c--;
                        i++;
                        text.setText((String.valueOf(i)));
                        text3.setText((String.valueOf(c)));
                    }
                }
            }
        };
        aumentarresistencia.setOnClickListener(clickResistencia2);

        carisma1 = String.valueOf(text.getText());
        carisma2 = String.valueOf(text4.getText());
        i = Integer.parseInt(carisma1);
        d = Integer.parseInt(carisma2);

        View.OnClickListener clickCarisma1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    if (d < 10) {
                        sumacarisma.setText("(+" + String.valueOf(d) + ")");
                        d++;
                        i--;
                        text.setText((String.valueOf(i)));
                        text4.setText((String.valueOf(d)));
                    }
                }
            }
        };
        quitarcarisma.setOnClickListener(clickCarisma1);

        carisma1 = String.valueOf(text.getText());
        carisma2 = String.valueOf(text4.getText());
        i = Integer.parseInt(carisma1);
        d = Integer.parseInt(carisma2);

        View.OnClickListener clickCarisma2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 21) {
                    if (d > 1) {
                        d--;
                        i++;
                        text.setText((String.valueOf(i)));
                        text4.setText((String.valueOf(d)));
                    }
                }
            }
        };
        aumentarcarisma.setOnClickListener(clickCarisma2);

        inteligencia1 = String.valueOf(text.getText());
        inteligencia2 = String.valueOf(text5.getText());
        i = Integer.parseInt(inteligencia1);
        e = Integer.parseInt(inteligencia2);

        View.OnClickListener clickInteligencia1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    if (e < 10) {
                        sumainteligencia.setText("(+" + String.valueOf(e) + ")");
                        e++;
                        i--;
                        text.setText((String.valueOf(i)));
                        text5.setText((String.valueOf(e)));
                    }
                }
            }
        };
        quitarinteligencia.setOnClickListener(clickInteligencia1);

        inteligencia1 = String.valueOf(text.getText());
        inteligencia2 = String.valueOf(text5.getText());
        i = Integer.parseInt(inteligencia1);
        e = Integer.parseInt(inteligencia2);

        View.OnClickListener clickInteligencia2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 21) {
                    if (e > 1) {
                        e--;
                        i++;
                        text.setText((String.valueOf(i)));
                        text5.setText((String.valueOf(e)));
                    }
                }
            }
        };
        aumentarinteligencia.setOnClickListener(clickInteligencia2);

        agilidad1 = String.valueOf(text.getText());
        agilidad2 = String.valueOf(text6.getText());
        i = Integer.parseInt(agilidad1);
        f = Integer.parseInt(agilidad2);

        View.OnClickListener clickAgilidad1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    if (f < 10) {
                        sumaagilidad.setText("(+" + String.valueOf(f) + ")");
                        f++;
                        i--;
                        text.setText((String.valueOf(i)));
                        text6.setText((String.valueOf(f)));
                    }
                }
            }
        };
        quitaragilidad.setOnClickListener(clickAgilidad1);

        agilidad1 = String.valueOf(text.getText());
        agilidad2 = String.valueOf(text6.getText());
        i = Integer.parseInt(agilidad1);
        f = Integer.parseInt(agilidad2);

        View.OnClickListener clickAgilidad2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 21) {
                    if (f > 1) {
                        f--;
                        i++;
                        text.setText((String.valueOf(i)));
                        text6.setText((String.valueOf(f)));
                    }
                }
            }
        };
        aumentaragilidad.setOnClickListener(clickAgilidad2);

        suerte1 = String.valueOf(text.getText());
        suerte2 = String.valueOf(text7.getText());
        i = Integer.parseInt(suerte1);
        g = Integer.parseInt(suerte2);

        View.OnClickListener clickSuerte1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    if (g < 10) {
                        sumasuerte.setText("(+" + String.valueOf(g) + ")");
                        g++;
                        i--;
                        text.setText((String.valueOf(i)));
                        text7.setText((String.valueOf(g)));
                    }
                }
            }
        };
        quitarsuerte.setOnClickListener(clickSuerte1);

        suerte1 = String.valueOf(text.getText());
        suerte2 = String.valueOf(text7.getText());
        i = Integer.parseInt(suerte1);
        g = Integer.parseInt(suerte2);

        View.OnClickListener clickSuerte2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i < 21) {
                    if (g > 1) {
                        g--;
                        i++;
                        text.setText((String.valueOf(i)));
                        text7.setText((String.valueOf(g)));
                    }
                }
            }
        };
        aumentarsuerte.setOnClickListener(clickSuerte2);


        nombre.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                nom = String.valueOf(nombre.getText());
                Log.i("Nombre", String.valueOf(nom));
                return true;
            }
        });

        View.OnClickListener clickResumen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Datos", nom);
                Log.i("Datos", sexo);
                Log.i("Datos", complemento);
            }
        };
        resumen.setOnClickListener(clickResumen);

    }

    public void onRadioButtonClicked(View v) {

        boolean check = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.hombre:
                if (check) {
                    sexo = String.valueOf(hombre.getText());
                    Log.i("Sexo", sexo);
                }
                break;
            case R.id.mujer:
                if (check) {
                    sexo = String.valueOf(mujer.getText());
                    Log.i("Sexo", sexo);
                }
                break;
        }
    }

    public void onCheckBoxClicked(View v) {

        boolean check = ((CheckBox) v).isChecked();

        switch (v.getId()) {
            case R.id.arma:
                if (check) {
                    compArma = String.valueOf(arma.getText());
                    Log.i("Complemento", compArma);
                } else
                    compArma = "";
                break;
            case R.id.compañero:
                if (check) {
                    compCom = String.valueOf(compañero.getText());
                    Log.i("Complemento", compCom);
                } else
                    compCom = "";
                break;
            case R.id.medicina:
                if (check) {
                    compMed = String.valueOf(medicina.getText());
                    Log.i("Complemento", compMed);
                } else
                    compMed = "";
                break;
        }
        complemento = compArma + " / " + compCom + " / " + compMed;
        Log.i("Complementos", complemento);
    }


}

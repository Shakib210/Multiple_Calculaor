package calculator.example.calculator;

import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import calculator.example.calculator.R;


public class scCal extends AppCompatActivity {

    private EditText dis;
    private TextView show;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, sum, sub, mul, div, dot, per, eql, clear, sqr, power, log, sin, cos, tan, on, back, factor, pai, root;
    Boolean sm = false;
    Boolean sb = false;
    Boolean ml = false;
    Boolean dv = false;
    Boolean pwr = false;
    Boolean lg = false;
    Boolean sn = false;
    Boolean pr = false;
    Boolean cs = false;
    Boolean tn = false;
    Boolean rt = false;
    Boolean eq = false;

    String older, newer, repeat;
    int n = 1, s = 0, b = 0, m = 0, d = 0;
    double d1, d2, d3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc_cal);
        this.setTitle("Scientific Calculator");
        dis = findViewById(R.id.niche);
        b0 = findViewById(R.id.n0);
        b1 = findViewById(R.id.n1);
        b2 = findViewById(R.id.n2);
        b3 = findViewById(R.id.n3);
        b4 = findViewById(R.id.n4);
        b5 = findViewById(R.id.n5);
        b6 = findViewById(R.id.n6);
        b7 = findViewById(R.id.n7);
        b8 = findViewById(R.id.n8);
        b9 = findViewById(R.id.n9);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        dot = findViewById(R.id.dot);
        eql = findViewById(R.id.eql);
        per = findViewById(R.id.per);
        show = findViewById(R.id.upore);
        clear = findViewById(R.id.clear);
        sqr = findViewById(R.id.sqr);
        power = findViewById(R.id.power);
        sqr.setText(Html.fromHtml("x<sup>2</sup>"));
        power.setText(Html.fromHtml("x<sup>n</sup>"));
        log = findViewById(R.id.log);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        on = findViewById(R.id.on);
        factor = findViewById(R.id.factor);
        pai = findViewById(R.id.pai);
        root = findViewById(R.id.root);
        back = findViewById(R.id.back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old = dis.getText().toString();
                dis.setText(old + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();
                dis.setText(old + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eq == true) {
                    dis.setText("");
                    eq = false;
                }
                String old = dis.getText().toString();


                if (n == 1) {
                    dis.setText(old + ".");
                } else return;
                n = 0;
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    eq = false;

                    older = dis.getText().toString();
                    if (older.isEmpty()) return;
                    d1 = Double.parseDouble(older);


                    if (s == 1) {
                        repeat = show.getText().toString();
                        d3 = Double.parseDouble(repeat);
                        show.setText("" + (d1 + d3));
                        b = 1;
                        m = 1;
                        d = 1;
                        sm = true;
                    } else {
                        show.setText("" + d1);
                    }
                    dis.setText("");
                    sm = true;
                    n = 1;
                    s = 1;
                } catch (Exception c) {
                    return;
                }


            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq = false;
                older = dis.getText().toString();
                if (older.isEmpty()) return;
                d1 = Double.parseDouble(older);

                if (b == 1) {
                    repeat = show.getText().toString();
                    d3 = Double.parseDouble(repeat);
                    show.setText("" + (d3 - d1));
                    s = 1;
                    d = 1;
                    m = 1;
                    sb = true;
                } else {
                    show.setText("" + d1);
                }
                dis.setText("");
                sb = true;
                n = 1;
                b = 1;


            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq = false;
                older = dis.getText().toString();
                if (older.isEmpty()) return;
                d1 = Double.parseDouble(older);

                if (m == 1) {
                    repeat = show.getText().toString();
                    d3 = Double.parseDouble(repeat);
                    show.setText("" + (d1 * d3));
                    s = 1;
                    b = 1;
                    d = 1;
                    ml = true;
                } else {
                    show.setText("" + d1);
                }
                dis.setText("");
                ml = true;
                n = 1;
                m = 1;

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eq = false;
                older = dis.getText().toString();
                if (older.isEmpty()) return;
                d3 = Double.parseDouble(older);

                if (d == 1) {
                    repeat = show.getText().toString();
                    d3 = Double.parseDouble(repeat);
                    show.setText("" + (d3 / d1));
                    s = 1;
                    b = 1;
                    m = 1;
                    dv = true;
                } else {
                    show.setText("" + d1);
                }
                dis.setText("");
                dv = true;
                n = 1;
                d = 1;

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eq = false;
                dis.setText("");
                d1 = 0;
                d2 = 0;
                d3 = 0;
                s = 0;
                b = 0;
                m = 0;
                d = 0;

            }
        });


        factor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String net = dis.getText().toString();
                if (net.isEmpty()) return;
                int save = 1;
                int fac = Integer.parseInt(net);
                for (int i = fac; i > 0; i--) {
                    save = save * i;
                }
                show.setText(net + "!");
                dis.setText("" + save);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bk = dis.getText().toString();
                if (!bk.isEmpty()) {
                    if (bk.length() > 0) {
                        bk = bk.substring(0, bk.length() - 1);
                        dis.setText(bk);
                    }
                }
            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eq = true;
                try {

                    newer = dis.getText().toString();
                    if (newer.isEmpty()) return;

                    d1 = Double.parseDouble(older);
                    d2 = Double.parseDouble(newer);

                    if (pr == true) {
                        double value = (d2 / d1) * 100;
                        dis.setText("" + value);
                        pr = false;
                    } else if (pwr == true) {
                        dis.setText("" + (Math.pow(d1, d2)));
                        show.setText("");
                        pwr = false;
                    } else if (sm == false && sb == false && ml == false && dv == false) return;

                    if (sm == true) {
                        repeat = show.getText().toString();
                        d3 = Double.parseDouble(repeat);
                        dis.setText("" + (d2 + d3));
                        sm = false;
                        s = 0;
                        show.setText("");
                    } else if (sb == true) {
                        repeat = show.getText().toString();
                        d3 = Double.parseDouble(repeat);
                        dis.setText("" + (d3 - d2));
                        sb = false;
                        b = 0;
                        show.setText("");
                    } else if (ml == true) {
                        repeat = show.getText().toString();
                        d3 = Double.parseDouble(repeat);
                        dis.setText("" + (d2 * d3));
                        ml = false;
                        m = 0;
                        show.setText("");
                    } else if (dv == true) {
                        repeat = show.getText().toString();
                        d3 = Double.parseDouble(repeat);
                        dis.setText("" + (d3 / d2));
                        dv = false;
                        d = 0;
                        show.setText("");
                    } else return;


                } catch (Exception e) {
                    if (sn == true) {
                        String b = dis.getText().toString();
                        d3 = Double.parseDouble(b);
                        double res = Math.sin(Math.toRadians(d3));
                        show.setText("Sin" + d3);
                        dis.setText("" + res);
                        sn = false;
                    } else if (cs == true) {
                        String b = dis.getText().toString();
                        d3 = Double.parseDouble(b);
                        double res = Math.cos(Math.toRadians(d3));
                        show.setText("Cos" + d3);
                        dis.setText("" + res);
                        cs = false;
                    } else if (tn == true) {
                        String b = dis.getText().toString();
                        d3 = Double.parseDouble(b);
                        double res = Math.tan(Math.toRadians(d3));
                        show.setText("Tan" + d3);
                        dis.setText("" + res);
                        tn = false;
                    }

                }
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newer = dis.getText().toString();
                if (newer.isEmpty()) return;


                d1 = Double.parseDouble(newer);
                dis.setText("" + Math.log(d1));


            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                older = dis.getText().toString();
                show.setText(older);
                dis.setText("");
                pr = true;
            }
        });
        pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newer = dis.getText().toString();
                if (newer.isEmpty()) return;


                d1 = Double.parseDouble(newer);
                dis.setText("" + Math.PI * d1);
            }
        });
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                newer = dis.getText().toString();
                if (newer.isEmpty()) return;


                d1 = Double.parseDouble(newer);
                show.setText("√" + newer);
                dis.setText("" + (Math.sqrt(d1)));

            }
        });

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sn = true;
                show.setText("Sin");
                dis.setText("");
                cs = false;
                tn = false;

            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cs = true;
                show.setText("Cos");
                dis.setText("");
                sn = false;
                tn = false;
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tn = true;
                show.setText("Tan");
                dis.setText("");
                cs = false;
                sn = false;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText("");
                show.setText("");
            }
        });

        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = dis.getText().toString();
                if (s.isEmpty()) return;
                double d = Double.parseDouble(s);
                dis.setText("" + d * d);

            }
        });
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                older = dis.getText().toString();
                show.setText(older + "^");
                dis.setText("");
                pwr = true;

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
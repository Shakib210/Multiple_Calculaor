package calculator.example.calculator;


import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import calculator.example.calculator.R;

public class cal extends AppCompatActivity {
    private EditText dis;
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,sum,sub,mul,div,dot,per,eql;
    Boolean sm= false;
    Boolean sb= false;
    Boolean ml= false;
    Boolean dv= false;
    String older,newer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        this.setTitle("Normal Calculator");
        dis=findViewById(R.id.display);
        b0=findViewById(R.id.n0);
        b1=findViewById(R.id.n1);
        b2=findViewById(R.id.n2);
        b3=findViewById(R.id.n3);
        b4=findViewById(R.id.n4);
        b5=findViewById(R.id.n5);
        b6=findViewById(R.id.n6);
        b7=findViewById(R.id.n7);
        b8=findViewById(R.id.n8);
        b9=findViewById(R.id.n9);
        sum=findViewById(R.id.sum);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        dot=findViewById(R.id.dot);
        eql=findViewById(R.id.eql);
        per=findViewById(R.id.per);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+"9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String old= dis.getText().toString();
                dis.setText(old+".");
            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                older= dis.getText().toString();
                dis.setText("");
                sm=true;

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                older= dis.getText().toString();
                dis.setText("");
                sb=true;

            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                older= dis.getText().toString();
                dis.setText("");
                ml=true;

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                older= dis.getText().toString();
                dis.setText("");
                dv=true;

            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dis.setText("");
            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newer=dis.getText().toString();
                if(newer.isEmpty()) return;
                double d1=Double.parseDouble(older);
                double d2=Double.parseDouble(newer);
                if(sm==true){
                    dis.setText(""+(d1+d2));
                    sm=false;
                }else if(sb==true){
                    dis.setText(""+(d1-d2));
                    sb=false;
                }else
                if(ml==true){
                    dis.setText(""+(d1*d2));
                    ml=false;
                }else
                if(dv==true){
                    dis.setText(""+(d1/d2));
                    dv=false;
                }


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

package com.example.nasser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final TextView T = findViewById(R.id.textView);
      final EditText quz = findViewById(R.id.editText);
      final EditText Hw = findViewById(R.id.editText2);
      final EditText mid = findViewById(R.id.editText3);
      final EditText Final = findViewById(R.id.editText4);
      final Button c = findViewById(R.id.button);
      final Button Re = findViewById(R.id.button2);
      final TextView f = findViewById(R.id.textView2);
      c.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view){
              double  n1 = Double.parseDouble(quz.getText().toString());
              double  n2 = Double.parseDouble(Hw.getText().toString());
           double  n3 = Double.parseDouble(mid.getText().toString());
           double  n4 = Double.parseDouble(Final.getText().toString());

           double result = n1 + n2 + n3 + n4 ;
           Toast.makeText(MainActivity.this, "the addition is : "+result,Toast.LENGTH_LONG).show();




            if (result>=90){f.setText('A'); }
            else if (result>=80){f.setText('B'); }
            else if (result>=70){f.setText('C'); }
            else if (result>=60){f.setText('D'); }
            else { f.setText('F');}













          }
      });



  }
}

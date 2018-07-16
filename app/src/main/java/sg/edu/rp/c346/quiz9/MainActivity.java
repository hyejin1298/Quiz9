package sg.edu.rp.c346.quiz9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFormula;
    ArrayList<Formula> alFormula;
    CustomAdapter caFormula;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);
        alFormula = new ArrayList<>();

        Formula f1 = new Formula("Area of rectangle" , "Length x Length" , "Formula type is : Area");
        Formula f2 = new Formula("Area of triangle" , "(Length of base x Length )/2" ,"Formula type is : Area" );
        Formula f3 = new Formula("Area of Volume of cube" , "Length x Length x Length" , "Formula type is : Volume");


        alFormula.add(f1);
        alFormula.add(f2);
        alFormula.add(f3);

        caFormula = new CustomAdapter(this , R.layout.formula , alFormula);

        lvFormula.setAdapter(caFormula);
    }
}

package sg.edu.rp.c346.quiz9;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16003810 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<Formula> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Formula> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        formulaList = objects;


    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        Formula currentItem = formulaList.get(position);
        String  formula  = currentItem.getFormula();
        String name = currentItem.getName();
        String type = currentItem.getType();
        tvName.setText(name);
        tvDate.setText(formula);
        tvType.setText(type);



        return rowView;

    }





}

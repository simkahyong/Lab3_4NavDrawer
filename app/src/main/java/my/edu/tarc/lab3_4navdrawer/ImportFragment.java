package my.edu.tarc.lab3_4navdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImportFragment extends Fragment {


    public ImportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_import, container, false);
        // Inflate the layout for this fragment
        final TextView textViewMessage;
        textViewMessage = view.findViewById(R.id.textViewMessage);
        Button buttonShowMessage;
        buttonShowMessage = view.findViewById(R.id.buttonShowMessage);
        buttonShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewMessage.setText("Hello Fragment");
            }
        });

        return view;

    }

}

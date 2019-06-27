package com.sajjad.dialogfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class DialogFragment extends android.support.v4.app.DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.dialog_fragment,container,false);

        // getting data from MainActivity
        Bundle arguments=getArguments();
        //
        final EditText user_name=view.findViewById(R.id.user_name);
        final EditText user_password=view.findViewById(R.id.user_password);
        user_name.setText(arguments.getString("user_name"));

        Button log_in=view.findViewById(R.id.log_in);
        log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // passing data to MainActivity
                ((MainActivity)getActivity()).userName.setText(user_name.getText().toString());
                ((MainActivity)getActivity()).password.setText(user_password.getText().toString());
                dismiss();
            }
        });

        return  view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onActivityCreated(savedInstanceState);
    }
}
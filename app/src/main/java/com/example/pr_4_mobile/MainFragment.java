package com.example.pr_4_mobile;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    Button button_check_drinks;
    Button button_check_food;

    public MainFragment() {
        super(R.layout.fragment_main);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button_check_drinks = (Button) getActivity().findViewById(R.id.button_check_drinks);
        button_check_food = (Button) getActivity().findViewById(R.id.button_check_food);

        button_check_drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                SecondFragment.class, null, "Second Fragment")
                        .commit();
            }
        });

        button_check_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragment_main_container_view,
                                ThirdFragment.class, null, "Third Fragment")
                        .commit();
            }
        });
    }
}
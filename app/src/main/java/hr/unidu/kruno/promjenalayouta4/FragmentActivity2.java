package hr.unidu.kruno.promjenalayouta4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class FragmentActivity2 extends Fragment {
    private NasViewModel model;
    private RatingBar pr;
    private CheckBox re, up;
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.activity_fragment2, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Ovdje se pristupa elementima stvorenog viewa fragmenta
        // Povezuje se s grafičkim objektima, registriraju se listeneri,...
        // Povezuje se s modelom
        model = new ViewModelProvider(requireActivity()).get(NasViewModel.class);
        pr = view.findViewById(R.id.ratingBar);
        pr.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                model.setRating(rating); // ažurira model
            }
        });

        CheckBox re = view.findViewById(R.id.checkRedovan);
        CheckBox up = view.findViewById(R.id.checkUpisan);
        re.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                model.setRedovan(isChecked);
            }
        });
        up.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                model.setUpisan(isChecked);
            }
        });

        pr.setRating(model.getRating());
        re.setChecked(model.isRedovan());
        up.setChecked(model.isUpisan());
    }
}

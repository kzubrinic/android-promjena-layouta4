package hr.unidu.kruno.promjenalayouta4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class FragmentActivity extends Fragment {
    private ImageView slika;
    private TextView ime, prezime;
    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.activity_fragment, parent, false);
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Ovdje se pristupa elementima stvorenog viewa fragmenta
        // Povezuje se s grafičkim objektima, registriraju se listeneri,...
        slika = view.findViewById(R.id.slika);
        // registrira se listener na pritisak na sliku
        slika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Pritisnuta slika!", Toast.LENGTH_LONG).show();
            }
        });
        // Učitava sliku iz drawable resursa na temelju njezinog naziva i prikazuje je
        slika.setImageDrawable(getResources().getDrawable(R.drawable.music_face));
        // Ovdje se pristupa elementima stvorenog viewa fragmenta
        // Povezuje se s grafičkim objektima, registriraju se listeneri,...
        ime = view.findViewById(R.id.ime);
        prezime = view.findViewById(R.id.prezime);
        ime.setText("Ana");
        prezime.setText("Anić");
    }

}

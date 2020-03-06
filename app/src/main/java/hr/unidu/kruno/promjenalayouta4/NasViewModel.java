package hr.unidu.kruno.promjenalayouta4;

import androidx.lifecycle.ViewModel;

public class NasViewModel extends ViewModel {
    // pamti logičke vrijednosti i rating
    private boolean redovan;
    private boolean upisan;
    private float rating;
    // get i set metode za svaku varijablu
    public boolean isRedovan() {
        return redovan;
    }

    public void setRedovan(boolean redovan) {
        this.redovan = redovan;
    }

    public boolean isUpisan() {
        return upisan;
    }

    public void setUpisan(boolean upisan) {
        this.upisan = upisan;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
package com.example.ams.brewed.interfaces;

import com.example.ams.brewed.data.Beer;

/**
 * Created by PC on 02/06/2015.
 */
public interface IBeerView {

<<<<<<< HEAD
    void displayInfo(Beer beer);
    void startSearchingProgress();
    void stopSearchingProgress();
=======
    void changeBackgroundColorBySRM();
    void displayInfo(Beer beer);

    void startShowInProgress();

    void stopShowSearchInProgress();
>>>>>>> origin/master

    void showError(String message);
}

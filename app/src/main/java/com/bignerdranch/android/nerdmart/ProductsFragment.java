package com.bignerdranch.android.nerdmart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.android.nerdmartservice.service.NerdMartServiceInterface;

import timber.log.Timber;

public class ProductsFragment extends NerdMartAbstractFragment {
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Timber.i("injected" + mNerdMartServiceInterface);
        View view = inflater.inflate(R.layout.fragment_products, container, false);
        return view;
    }
}

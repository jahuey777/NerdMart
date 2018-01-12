package com.bignerdranch.android.nerdmart.inject;

import android.content.Context;

import com.bignerdranch.android.nerdmartservice.service.NerdMartService;
import com.bignerdranch.android.nerdmartservice.service.NerdMartServiceInterface;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaimejahuey on 1/11/18.
 */
//
//This class defines how the dependency injection framework will go about creating the individual instances of objects in our app

@Module
public class NerdMartApplicationModule {

    private Context mApplicationContext;

    public NerdMartApplicationModule(Context context){
        mApplicationContext = context.getApplicationContext();
    }

    @Provides
    NerdMartServiceInterface provideMartServiceInterface(){
        return new NerdMartService();
    }

}


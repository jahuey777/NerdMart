package com.bignerdranch.android.nerdmart.inject;

import com.bignerdranch.android.nerdmart.NerdMartApplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jaimejahuey on 1/11/18.
 */
//This component contains an initializer used to setup our NerdMartApplicationModule


//The annotation marks NerdMartComponent interface as a component in the dagger 2 framework
//We also configure which modules will be used with the component, nermartapplicationmodule in this case

@Singleton
@Component(modules = {NerdMartApplicationModule.class})
public interface NerdMartComponent extends NerdMartGraph {

    final class Initializer{
        private  Initializer(){
            throw new AssertionError("No instance");
        }

        //returns a working implementation of the nerdmartcomponent interface we defined
        public static NerdMartGraph init(NerdMartApplication app){
            return DaggerNerdMartComponent.builder()
                    .nerdMartApplicationModule(new NerdMartApplicationModule(app))
                    .build();
        }
    }
}

package com.bignerdranch.android.nerdmart.inject;

import android.content.Context;

import com.bignerdranch.android.nerdmart.NerdMartConstants;

/**
 * Created by jaimejahuey on 1/11/18.
 */

public final class Injector {

    private Injector(){
        throw new AssertionError("No instances.");
    }

    @SuppressWarnings("ResourceType")//Explicitly doing a custom service
    public static NerdMartGraph obtain(Context context){
        return (NerdMartGraph) context.getApplicationContext()
                .getSystemService(NerdMartConstants.INJECTOR_SERVICE);
    }

    public static boolean matchesService(String name){
        return NerdMartConstants.INJECTOR_SERVICE.equals(name);
    }
}

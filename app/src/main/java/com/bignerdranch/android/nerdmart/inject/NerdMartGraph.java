package com.bignerdranch.android.nerdmart.inject;

import com.bignerdranch.android.nerdmart.NerdMartAbstractFragment;

/**
 * Created by jaimejahuey on 1/11/18.
 */

//This 'Graph' is the bridge between our module and the instantaion of the classes the module provides to our application
//Here we will list the classes that we intend to target with the dependency injection
public interface NerdMartGraph {

    //This abstract fragment will handle the injection logic so any fragment that subclasses it will automatically
    //be able to use Dependency Injection
    void inject(NerdMartAbstractFragment fragment);
}

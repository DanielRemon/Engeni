package com.teclab.dremon.engine;

import android.net.sip.SipSession;

/**
 * Created by Alumno on 11/04/2017.
 */

public class EventDispatcher {

    private List listeners;
    públic EventDispatcher()
    {
        listeners = new ArrayList();
    }
    public void addEventListener(String type)
    {
        listeners.add(type);

    }


    /*public void dispatchEvent(Event e)
    {
        Event e=newEvent(e);
        if(e.target == null)
            e.target=this;
        for(int i=0; i < listeners.size(); i++)
            if(((String)listeners.get(i)).equals(type))
                reciveEvent(e);

    }
    */


    public void dispatchEvent(string type)
    {
        Event e=newEvent(type);
        if(e.target == null)
            e.target=this;
        for(int i=0; i < listeners.size(); i++)
            if(((String)listeners.get(i)).equals(type))
                reciveEvent(e);

    }


}


package com.teclab.dremon.engine;

/**
 * Created by Alumno on 11/04/2017.
 */

package com.gtem.engine;


public class Event
{


    public Event(String _type)
    {

        type = _type;

    }
    public Event(String _type, Object _data)
    {
        type =_type;
        data= _data;
    }


    public EventDipatcher currentTarget;
    public EventDipatcher Target;
    public String type;
    public Object data;
}

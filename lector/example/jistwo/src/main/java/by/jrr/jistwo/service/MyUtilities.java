package by.jrr.jistwo.service;

public class MyUtilities
{
    public static String mimicObjectToString(Object o)
    {
        //prevent a NullPointerException by returning null if o is null
        String result = null;
        if (o !=null)
        {
            result = o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
        }
        return  result;
    }
}

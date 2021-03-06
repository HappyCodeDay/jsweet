package def.js;
/**
  * Creates a new function.
  */
public class Function extends def.js.Object {
    /**
      * Calls the function, substituting the specified object for the this value of the function, and the specified array for the arguments of the function.
      * @param thisArg The object to be used as the this object.
      * @param argArray A set of arguments to be passed to the function.
      */
    native public java.lang.Object apply(java.lang.Object thisArg, java.lang.Object argArray);
    /**
      * Calls a method of an object, substituting another object for the current object.
      * @param thisArg The object to be used as the current object.
      * @param argArray A list of arguments to be passed to the method.
      */
    native public java.lang.Object call(java.lang.Object thisArg, java.lang.Object... argArray);
    /**
      * For a given function, creates a bound function that has the same body as the original function. 
      * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
      * @param thisArg An object to which the this keyword can refer inside the new function.
      * @param argArray A list of arguments to be passed to the new function.
      */
    native public java.lang.Object bind(java.lang.Object thisArg, java.lang.Object... argArray);
    public java.lang.Object prototype;
    public final double length=0;
    public java.lang.Object arguments;
    public Function caller;
    /**
      * Creates a new function.
      * @param args A list of arguments the function accepts.
      */
    public Function(java.lang.String... args){}
    native public static Function applyStatic(java.lang.String... args);
    /**
      * Calls the function, substituting the specified object for the this value of the function, and the specified array for the arguments of the function.
      * @param thisArg The object to be used as the this object.
      * @param argArray A set of arguments to be passed to the function.
      */
    native public java.lang.Object apply(java.lang.Object thisArg);
    native public java.lang.Object caller(java.lang.Object... args);
    protected Function(){}
}


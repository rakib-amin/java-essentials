#### under `java.lang` package

- `public class IllegalStateException extends RuntimeException`

*Signals that a method has been invoked at an illegal or inappropriate time. In other words, the Java environment or Java application is not in an appropriate state for the requested operation.*

- `public class InterruptedException extends Exception`

*Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity. Occasionally a method may wish to test whether the current thread has been interrupted, and if so, to immediately throw this exception. The following code can be used to achieve this effect:*

  ~~~~
  if (Thread.interrupted())  // Clears interrupted status!
      throw new InterruptedException();
 ~~~~
 
- `public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException`

*Thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.* 

- `public class ClassCastException extends RuntimeException`

*Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance. For example, the following code generates a ClassCastException:*
~~~
         Object x = new Integer(0);
         System.out.println((String)x);
~~~  



- `public class NullPointerException extends RuntimeException`

*Thrown when an application attempts to use null in a case where an object is required. These include:*

    1. Calling the instance method of a null object.
    2. Accessing or modifying the field of a null object.
    3. Taking the length of null as if it were an array.
    4. Accessing or modifying the slots of null as if it were an array.
    5. Throwing null as if it were a Throwable value. 

*Applications should throw instances of this class to indicate other illegal uses of the null object. NullPointerException objects may be constructed by the virtual machine as if suppression were disabled and/or the stack trace was not writable.*

- `public class RuntimeException extends Exception`

*RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.*

*RuntimeException and its subclasses are unchecked exceptions. Unchecked exceptions do not need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.*

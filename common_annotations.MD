#### under `java.lang` 

- `public @interface Override`

*Indicates that a method declaration is intended to override a method declaration in a supertype. If a method is annotated with this annotation type compilers are required to generate an error message unless at least one of the following conditions hold:*

    1. The method does override or implement a methfaceod declared in a supertype.
    2. The method has a signature that is override-equivalent to that of any 
    public method declared in Object.  

- `public @interface SuppressWarnings`

*Indicates that the named compiler warnings should be suppressed in the annotated element (and in all program elements contained in the annotated element). Note that the set of warnings suppressed in a given element is a superset of the warnings suppressed in all containing elements. For example, if you annotate a class to suppress one warning and annotate a method to suppress another, both warnings will be suppressed in the method.*

*As a matter of style, programmers should always use this annotation on the most deeply nested element where it is effective. If you want to suppress a warning in a particular method, you should annotate that method rather than its class.*

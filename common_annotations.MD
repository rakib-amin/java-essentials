#### under `java.lang` 

- `public @interface Override`

*Indicates that a method declaration is intended to override a method declaration in a supertype. If a method is annotated with this annotation type compilers are required to generate an error message unless at least one of the following conditions hold:*

    1. The method does override or implement a methfaceod declared in a supertype.
    2. The method has a signature that is override-equivalent to that of any public method declared in Object.  c
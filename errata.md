# Errata for *Oracle Certified Professional Java SE 8 Programmer Exam 1z0-809*

On **57** [The class Number is not a final class.]:
 
The authors state "To avoid such a problem, widely used classes like these and wrapper classes such as Number and Integer are made final in the Java library."

However, the "Number" class is abstract and it is the base class of some wrapper classes so it cannot be final.

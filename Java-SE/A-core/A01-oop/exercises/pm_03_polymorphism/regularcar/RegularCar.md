## 1) Inheritance

Create a superclass called RegularCar. The RegularCar class has the following fields and methods:
 - speed (int)
 - regularPrice (double)
 - color (String)
 - double getSalePrice()
 
Create a subclass of RegularCar class and name it as Truck. The Truck class has the following fields and methods:
 - weight (int)
 - double getSalePrice() - if weight is over 2000 then add 10% discount, otherwise add 20% discount
 
Create a subclass of RegularCar class and name it as Ford. The Ford class has the following fields and methods:
 - year (int)
 - manufacturerDiscount (int)
 - double getSalePrice() - from the sale price computed from RegularCar class, subtract the manufacturer discount
 
Create a subclass of RegularCar class and name it as Sedan. The Sedan class has the following fields and methods:
 - length (int)
 - double getSalePrice() - if length is over 20 feet then add 5% discount, otherwise add 10% discount
 

## 2) Abstract Class

Modify point 1.
 
Make RegularCar an abstract class instead. Make the following function abstract (i.e.: remove the implementation):
 - getSalePrice()
 
Add another abstract function: 
 - getDescription()
 
Correct the code: add getDescription() implementation where missing.
(Add new fields or just return a String containing a few-word text.)
 
We can no longer instantiate a RegularCar object, we have to decide which subclass we want.
 
public abstract class RegularCar {
}


## 3) Interfaces I

Modify point 2.
 
Create an Interface named Sellable with one method:
 - double getSalePrice()
 
Remove the abstract getSalePrice() function from RegularCar.
 
Modify these classes, so they inherit from RegularCar AND implement Sellable:
 - Ford
 - Truck
 - Sedan
 
As we see, we don't have to change the function implementations.


## 4) Interfaces II

Modify point 3.
 
Create an Interface named Discountable that inherits from Sellable with one additional method:
 - double getDiscount()
 
Edit the Ford class:
 - make it implement Discountable()

## License

Copyright © Progmasters (QTC Kft.), 2018.
All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed, publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft. This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s students and for no other purposes by any parties other than QTC Kft.
This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.

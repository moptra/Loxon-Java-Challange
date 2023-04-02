## Before you start: 
- **Try not to read ahead.**
- **Do one task at a time. The trick is to learn to work incrementally.**
- **Make sure you only test for correct inputs, there is no need to test for invalid inputs for this kata**

# String Calculator

1. Create a simple String calculator with a method `int add(String numbers)`
    - The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example ```add("")``` or ```add("1")``` or ```add("1,2")```
    - Start with the simplest test case of an empty string and move to 1 and two numbers
    - Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
    - Remember to refactor after each passing test
2. Allow the `add` method to handle an unknown amount of numbers
3. Allow the `add` method to handle new lines between numbers (instead of commas)
    - the following input is ok:  ```1\n2,3```  (will equal 6)
    - the following input is NOT ok: ```1,\n ``` (no need to prove it - just clarifying)
4. Support different delimiters
    - to change a delimiter, the beginning of the string will contain a separate line that looks like this: ```//[delimiter]\n[numbers…]```, for example ```//;\n1;2``` should return three where the default delimiter is ‘;’ .
    - the first line is optional. all existing scenarios should still be supported
5. Numbers bigger than 1000 should be ignored, so adding 2 + 1001 + 3  = 5


#### License
 Copyright © Progmasters (QTC Kft.), 2016-2018.
 All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed, 
 publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including 
 photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft. 
 This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s 
 students and for no other purposes by any parties other than QTC Kft.
 This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
 Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary.


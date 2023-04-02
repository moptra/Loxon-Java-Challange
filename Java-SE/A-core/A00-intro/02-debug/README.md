# Debugging and Locating Bugs

## Objectives

- Be able to "mentally" run the program
- Write clean code
- Use refactoring
- Use the debugger to examine variables
- Implement logging for tracing your programs
- Write extensive tests
 
## Main Content

### Exercise: "Mental" debug

Solve the exercises in the mental package!

It is important to be able to understand code written by someone else.
Try to mentally follow what the program does. What methods have been called?
What are the current values of the variables? What does the loop do?
If you find it difficult to do that from memory, take notes.

### Workshop: Clean code

Consider the following two pieces of text. Which one do you prefer? Why?

```
A stratégia dokumentumrendszer részstratégiái megújításának hatására –
a felülvizsgálatra 2016. év folyamán került sor – a szervezet az elkövetkezendő
időszakban fókuszba helyezi, és kiemelt célként fogalmazza meg a minőségirányított
működés mellett, a folyamatos változásokra reagáló, megújuló és az újításokat
adaptáló szervezeti működést.
```

```
A stratégiai dokumentumrendszer 2016-os felülvizsgálatát a részstratégiák
megújítása követte. Ennek hatására a szervezet az elkövetkezendő időszakra
célként fogalmazta meg a minőségirányított működés mellett a folyamatos
változásokra reagáló, megújuló és az újításokat adaptáló szervezti működést.
```

Similarly to human language, programming languages are written, read and
modified by human beings. We are humans, our short-term memory and mental
capacity are limited and we make mistakes. Therefore, programmers aim to
produce well readable code that is easy to understand. We refer to such code
as **clean code**. There are several principles and best practices that should
be followed to get clean code. We will gradually learn how to write clean code.
For now, remember the motivation and follow your common sense. In general,
short code is good but tricky solutions and confusing loops should be avoided
just because they lead to short code.


## Training: Clean code: Meaningful names
 - User meaningful names
 - Use searchable names
 - Avoid magic numbers
 - Use pronounceable names

(source) https://medium.com/coding-skills/clean-code-101-meaningful-names-and-functions-bf450456d90c

### Workshop: Clean code: Meaningful names and refactoring

Check some code of yesterday pairs and discuss clean code issues (good and bad examples, as well).

If we are given code that is not clean but hard to read and understand, we
can automatically use IDEA to perform some changes and make the code more
clean. Such changes can be very simple, such as formatting the code, renaming
methods, renaming variables etc. Some changes are more complex, for example,
extracting a code snippet to a new method. These changes do not change the
behavior of the program but make the code better, more easy to understand.
We refer to the process of applying such changes as **refactoring**.
You have already seen some IDEA shortcuts. Remember that Ctrl-Alt-L formats
the code and you can rename almost anything with Shift-F6. If you do not
remember the shortcut of the rest of refactoring changes, just select the
affected element and right-click in the editor. You will find a Refactor submenu,
where you can choose from the possible refactoring changes.

Use refactor tools to fix clean code problems in code examples of previous day solutions:

 Right click (context menu): Refactor menu
  - Rename (Shift+F6)
  - Extract:
    - Method (Ctrl + Alt + m)
    - Variable (Ctrl + Alt + v)
    - Constant (Ctrl + Alt + c)


### Exercise: Refactoring

Solve the exercises in the refactor package!

### Hands-on: Methods

Programs do some work for us to make our life easier. The work that a program does
consists of steps.  The smallest units of steps are the statements we write in the
program, such as create int variable x and assign the value three to it, increment
the value of x, print the value of x etc. In real life we usually think in bigger
steps, for example, if I plan my day, I think if things like having breakfast,
going to work, work, having lunch, work again, doing the groceries etc. I do not
think of the smallest details, such as cutting bread, spreading butter, preparing
tea etc. even though these are necessary steps.  If I did, my daily plan would be
so long that I would totally lost control over it. Just like in real life, in
programming we also prefer to think in bigger steps.  For this, we would like to
create bigger units in our program.  These units are called **methods**.
Methods can have input parameters, that is, pieces of information that are
necessary to accomplish the task.  Methods can also have a return value, that is,
a result, that they created.

For example, when we make a tea, we need to know what kind of tea to prepare
and how many pieces of lump sugar to put it in. The result is the prepared tea.
And preparing tea involves boiling water, putting a tea filter in a cup,
pouring the water, waiting 5 minutes, throwing away the filer, adding sugar,
mixing the sugar and serving the tea. If it were a Java program, it could be
something like this:

```java
public static String makeTea(String kind, int sugar) {
    System.out.println("Boiling water");
    System.out.println("Putting a " + kind + " tea filter into a cup");
    System.out.println("Pouring water");
    System.out.println("Waiting 5 minutes");
    System.out.println("Throwing away the filter");
    System.out.println("Adding " + sugar + " pieces of sugar");
    System.out.println("Mixing sugar");
    System.out.println("Serving tea");
    return kind + " tea with " + sugar + " pieces of sugar";
}
```

Now we can just call the makeTea() method to easily create different kinds of tea
whenever we need it:

```java
makeTea("green", 1);
makeTea("pu-erh", 0);
makeTea("rooibos", 2);
makeTea("lapsang souchong", 1);
```

Another good thing is that we can call it from different places as well. Let's say,
we drink tea for breakfast and dinner as well:


```java
public static void breakfast() {
    makeTea("earl grey", 2);
    // TODO: whatever else you need for breakfast
}

public static void dinner() {
    makeTea("green", 1);
    // TODO: whatever else you need for dinner
}
```

Methods can be called until arbitrary depth. For example, dailyRoutine() can call
morningRoutine(), which can call breakfast(), which can call makeTea() etc.

### Exercise: Defining and calling methods

Model an average daily routine of yours with methods just as seen above.
Create meaningful units of code to keep your main() method fairly simple and
easy to understand. You can use arbitrary depth of methods.  In each method
that you do not break down into smaller pieces, just print out the steps as
seen above.  The result of running the program must be the detailed list of
activities that you do during the whole day.

### Workshop: Examining the Call Stack

The call stack is basically a list of all of the currently active methods.
The parent of all the methods on the call stack is the main method.
The call stack is composed of frames, so the first frame in the call stack contains the 'call' (invocation) to the main method.
Suppose inside of the main method there is a 'call' to invoke method A and that method A then makes a 'call' to invoke method B,
then you would have three frames on the call stack beginning with main, A, then B.
The main purpose for a call stack is to determine which method should return control once a method has terminated.
When method B terminates, control is returned to method A, once method A terminates, control is returned to the main method.
When we "mentally" run the program, we must also remember the current call stack, which might be difficult for a complex
program. In the next step, we will see how it becomes easier with debugging but
first we better get to know the call stack.

### Exercise: Call Stack

Solve the exercise in callstack package!

### Workshop: Using the Debugger in IDEA

Debugging is the process of finding and (hopefully) resolving bugs in a system/application.
Debugger is the tool that can be used for debugging, and IDEA has such a built-in debugger.
The debugger can interrupt the program if it reaches a particular method or line. When
the program is interrupted, we can inspect its state. We see the call stack, the variables
and their values. We can then execute the program line by line and check how the call stack
and the state change.

### Workshop: Debugging

Run in Debug mode and use breakpoints, F8 és F9 and find the bugs!

Checkout debug_example.DebugTutorial class and follow the instructions there.

### Exercise

Solve the exercises in the debugger package!

### Workshop: Testing

You have already written some tests earlier in the previous module. Testing is another
important mechanism for finding bugs and making sure your software works expected.
Again, testing has some relevant differences compared to debugging and logging:

- Tests are encapsulated into classes but are rather considered as supplementary code,
not an organic part of your application.
- Debugging and logging focus on the inner working of the program, whereas
tests are often more concerned with the result it produces.
- Tests and debugging are performed by developers, whereas logging can work for
end-users as well.
- Logging and debugging provides a big variety of information on the program, whereas
tests only gives a pass or fail result.
- Logging and debugging require more manual work. You need to analyze the call stack,
variable states and log messages and find out if they reflect the correct behavior
or not. In turn, tests automatically provide a pass or fail result.
- Debugging is performed on demand, whereas logging and more specifically tests,
are very handy during the evolution of the software. If tests are executed after
changes to the existing code, it helps ensuring that the new changes do not
accidentally break functionality that used to work. This specific use of testing is
called **regression testing**.

> ### &#128161; Note: Always debug, test and log your code before asking help!
>
> During the course, if you get stuck with a particular exercise, always try to debug,
> test and log before asking for help. If you manage to find the bug yourself, it will
> give you a great sense of achievement. Furthermore, if you become a confident and
> autonomous programmer, it will greatly increase your career opportunities later.

### Workshop: Logging (optional reading)

Apart from debugging, there are other means for finding bugs. One of them is
logging. Logging means to print out information of the state of the program
during execution (either to the console or to a file). All of the important
events should be logged in a real-life application, such as which user logged
in at what time, which tasks the user tried to perform etc.

There are important differences between debugging and logging:
- Logging is an organic part of your program, wired into the code, whereas
debugging is performed with an external tool.
- Logging can work transparently in the background, whereas debugging is only
performed on demand for a specific bug.
- Debugging requires software developer knowledge. Logging works for the end-user.
- Logging only covers the information that you considered relevant beforehand.
If the pieces of information that you log are insufficient for finding the
source of the bug, you will need to fall back to debugging.

There are several logging libraries that are commonly used in complex applications.
Log messages are usually categorized into different categories based on how
important they are. The category names differ in different frameworks, but usually
there are six levels, such as error, warn, info, config, debug, trace.
Later on, we will use the Logback framework, for now, we only see a minimalistic
example for logging with JDK's own logger solution.

## Material Review

- clean code
- refactor
- call stack
- debugger
  - breakpoint
  - step into
  - step over
  - step out
  - resume
- testing
- debugging, logging, testing comparison

## See also

- https://imgur.com/gallery/e16qOEj

## Homework for the weekend!
- Feedback form!
- Udemy OOP lectures: (login:  course@progmasters.hu, password: PM17034266, https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/3561816#overview)
  - Section 7 - Lecture 41 - Inheritance - Part 1
  - Section 7 - Lecture 42 - Inheritance - Part 2
  - Section 7 - Lecture 43 - Inheritance Challenge Part 1 (+ Challenge Exercise)
  - Section 7 - Lecture 44 - Inheritance Challenge Part 2
  - Section 8 - Lecture 45 - Introduction
  - Section 8 - Lecture 46 - Composition
  - Section 8 - Lecture 47 - Composition Part 2 (+ Challenge Exercise)
  - Section 8 - Lecture 48 - Encapsulation
  - Section 8 - Lecture 49 - Encapsulation (+ Challenge Exercise)
  - Section 8 - Lecture 50 - Polymorphism
  - Section 8 - Lecture 51 - Polymorphism (+ Challenge Exercise)
  - Section 8 - Lecture 52 - OOP Master Challenge Exercise

## License 

Copyright © Progmasters (QTC Kft.), 2016-2018.
All rights reserved. No part or the whole of this Teaching Material (TM) may be reproduced, copied, distributed, publicly performed, disseminated to the public, adapted or transmitted in any form or by any means, including photocopying, recording, or other electronic or mechanical methods, without the prior written permission of QTC Kft. This TM may only be used for the purposes of teaching exclusively by QTC Kft. and studying exclusively by QTC Kft.’s students and for no other purposes by any parties other than QTC Kft.
This TM shall be kept confidential and shall not be made public or made available or disclosed to any unauthorized person.
Any dispute or claim arising out of the breach of these provisions shall be governed by and construed in accordance with the laws of Hungary. 
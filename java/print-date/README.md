# Goal
Be able to test ***printCurrentDate*** function without changing the method signature.


## Rules of the kata

* Under NO CIRCUNSTANCE touch the ProductionCodeDoNotTouch class. It is a very
  important production class that MUST NOT be modified.

* You must test the PrintDate class to ensure that it does what it should do.
  Since we want to mimic real-world coding standards, we will not tell you
  what the class do, you should know!

* You can change the PrintDate and PrintDateTest all you want with the following exceptions:
  * Do NOT change the name!
  * Do NOT change the signature of the method!
  * DO NOT change the name of the method!

* You can add libraries if you don't like mockito & friends.

## Steps

* Test the code with doubles created by you (interface method)
* Test the code with doubles from a library (usually mockito)

# Code to test
	public void printCurrentDate() {
		System.out.println(new Date());
	}


# Learnings
How to build a Mock and Stub manually.

How to use Mockito to generate the doubles.

### Example of mock
```java
@Test
public void should_interact_with_the_mock() {
    Collaborator collaborator = mock(Collaborator.class);
    MyClass myClass = new MyClass(collaborator);

    myClass.run();

    verify(collaborator).collaborate();
}
```

### Example of stub


```java
@Test
public void should_retrieve_the_stub_response(){
    Collaborator collaborator = mock(Collaborator.class);
    String collaboratorResponse = "collaborator response";
    when(collaborator.collaborate()).thenReturn(collaboratorResponse);
    MyClass myClass = new MyClass(collaborator);

    String result = myClass.run();

    assertEquals(result, collaboratorResponse);
}
```

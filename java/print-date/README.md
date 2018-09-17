# Goal
Be able to test ***printCurrentDate*** function without changing the method signature.

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

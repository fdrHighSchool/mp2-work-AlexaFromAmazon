# Shapes
#### Respond to the following:

1. Write a plan for the following output:
```
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
```
for(int row = 0; row < 3; row++) {
  for(int i = 0; i < 10; i++) {
    for(int rNum = 0; rNum < 3; rNum++) {
      System.out.print(i);
    }
  }
  System.out.println("");
}


2. Write a plan for the following output:
```
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
```
  * **YOUR WRITING HERE**
for(int row = 0; row < 5; row++) {
  for(int i = 9; i > 0; i--) {
    for(int rNum = 0; rNum < 5; rNum++) {
      System.out.print(i);
    }
  }
  System.out.println("");
}

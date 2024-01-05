package org.example.exo2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }

    @Test
    @DisplayName("Test Stack : push")
    public void testPush(){
        // Arrange

        // Act
        stack.push(1);
        int[] result = stack.getTableau();

        // Assert
        Assertions.assertEquals(1, result[0]);

    }

    @Test
    @DisplayName("Test Stack : pop")
    public void testPop(){
        // Arrange
        stack.push(2);
        stack.push(3);

        // Act
        stack.pop();
        int[] result = stack.getTableau();

        // Assert
        Assertions.assertEquals(2, result[0]);
    }

    @Test
    @DisplayName("Test Stack : peek")
    public void testPeek(){
        // Arrange
        stack.push(4);
        stack.push(5);

        // Act
        int resultPeek = stack.peek();
        int resultNoSuppression[] = stack.getTableau();

        // Assert
        Assertions.assertEquals(5, resultPeek);
        Assertions.assertEquals(5, resultNoSuppression[1]);
    }

    @Test
    @DisplayName("Test Stack : isEmpty")
    public void testisEmpty(){
        // Arrange

        // Act
        boolean result = stack.isEmpty();

        // Assert
        Assertions.assertEquals(true, result);
    }

    @Test
    @DisplayName("Test Stack : isFull")
    public void testIsFull(){
        // Arrange

        // Act

        // Assert

    }

}
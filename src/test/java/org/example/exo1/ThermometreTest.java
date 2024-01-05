package org.example.exo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class ThermometreTest {

    public Thermometre thermometre;

    @BeforeEach
    public void setUp(){
        thermometre = new Thermometre();
    }

    /**
     * Permet de tester la fonctionnalité principale de la méthode température,
     * càd donner la température la plus proche de 0
     */
    @Test
    @DisplayName("Test Thermometre")
    public void testTemperature(){
        // Arrange
        int[] tableauInts = {1, 2, 4, 8,-4, -1, 1323, 34,-45};

        // Act
        int result = thermometre.temperature(tableauInts);

        // Assert
        Assertions.assertEquals(1, result);

    }


    /**
     * Permet de tester le retour de 0 en cas d'envoi de tableau vide dans les paramètres
     */
    @Test
    @DisplayName("Test Thermometre : tableau vide")
    public void testTemperatureTableauVide(){
        // Arrange
        int[] tableauInt = {};

        // Act
        int result = thermometre.temperature(tableauInt);

        // Assert
        assertEquals( 0 , thermometre.temperature(tableauInt));
    }

    /**
     * Permet de tester l'exception en cas d'envoi d'un tableau dépassant la longueur requise (10000) dans les paramètres
     */
    @Test
    @DisplayName("Test Thermometre Exception : longueur tableau")
    public void testTemperatureExceptionLongueurTableau(){
        // Arrange
        int[] tableauInt = new int[10001];

        // Act
        int result = thermometre.temperature(tableauInt);

        // Assert
        assertThrows(IllegalArgumentException.class, () -> thermometre.temperature(tableauInt));
    }


}
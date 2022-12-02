/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author iOrlando
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    LocalDateTime startDate;
    LocalDateTime endDate;
    
    
    @Test
    public void testFindbonusLimiteFecha() {
        this.startDate = LocalDateTime.parse("2022-01-09 10:30" , formatter);
        this.endDate = LocalDateTime.parse("2021-03-09 10:30", formatter);
        System.out.println("findbonus");
        LocalDateTime startDate = this.startDate;
        LocalDateTime endDate = this.endDate;
        float amount = 1000000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
        
    }
      @Test
    public void testFindbonusLimiteMonto() {
        this.startDate = LocalDateTime.parse("2022-12-09 10:30" , formatter);
        this.endDate = LocalDateTime.parse("2023-09-09 10:30", formatter);
        System.out.println("findbonus");
        LocalDateTime startDate = this.startDate;
        LocalDateTime endDate = this.endDate;
        float amount = 299999;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    //Limite cuando es más de un anno y no empieza en diciembre 
      @Test
    public void testFindbonusLimiteAnnoCompleto() {
        this.startDate = LocalDateTime.parse("2022-01-09 10:30" , formatter);
        this.endDate = LocalDateTime.parse("2023-09-09 10:30", formatter);
        System.out.println("findbonus");
        LocalDateTime startDate = this.startDate;
        LocalDateTime endDate = this.endDate;
        float amount = 1000000;
        float expResult = -3;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
    
       @Test
    public void testFindbonusLimiteMedio() {
        this.startDate = LocalDateTime.parse("2022-12-30 10:30" , formatter);
        this.endDate = LocalDateTime.parse("2024-06-01 10:30", formatter);
        System.out.println("findbonus");
        LocalDateTime startDate = this.startDate;
        LocalDateTime endDate = this.endDate;
        float amount = 1000000;
        float expResult = 1500000;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0.0);
        
    }
    

    @Test
    public void testBonus() {
        System.out.println("bonus");
        long moth = 0L;
        float amount = 0.0F;
        float expResult = 0.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);
        
    }
    
}

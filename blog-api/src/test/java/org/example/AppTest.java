package org.example;

import static org.junit.Assert.assertTrue;

import org.example.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Autowired
    private LoginService loginService;
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}

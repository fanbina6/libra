package xyz.proteanbear.test;

import org.springframework.stereotype.Service;

/**
 * Task initialization.
 *
 * @author ProteanBear
 */
@Service
public class HelloService
{
    /**
     * Task hello
     * @return
     */
    public String hello()
    {
        return "Hello1,Libra!";
    }
}
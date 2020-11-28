package com.caishu;

import com.caishu.util.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MD5UtilsTset {


    @Test
    public void secret(){
        String username="admin";
        String password="caishu";
        String pass= MD5Utils.code(password);
        System.out.println(pass);
    }
}

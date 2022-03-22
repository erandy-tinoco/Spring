package com.erandy.bnrg.Dia9Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
public class Dia9SpringApplication {

    public static void main(String[] args)  {       
        
         SpringApplication.run(Dia9SpringApplication.class, args);
       // VentaController Dia9SpringApplication = cxt.getBean(VentaController.class);
        //ventaController.getProductos();

    }

  /*  @Bean
    @LoadBalanced
    public VentaController ventaController() {
        return new VentaController();
    }*/

}

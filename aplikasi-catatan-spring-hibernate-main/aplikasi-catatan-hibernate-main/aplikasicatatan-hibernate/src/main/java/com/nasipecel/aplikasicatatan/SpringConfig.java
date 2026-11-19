package com.nasipecel.aplikasicatatan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Konfigurasi Spring untuk mendeteksi class yang memakai @Component dan @Repository.
 */
@Configuration
@ComponentScan(basePackages = "com.nasipecel.aplikasicatatan")
public class SpringConfig {
}

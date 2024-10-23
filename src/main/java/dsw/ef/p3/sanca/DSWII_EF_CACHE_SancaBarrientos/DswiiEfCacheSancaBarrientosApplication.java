package dsw.ef.p3.sanca.DSWII_EF_CACHE_SancaBarrientos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DswiiEfCacheSancaBarrientosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheSancaBarrientosApplication.class, args);
	}

}

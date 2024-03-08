package org.example.insecure.v1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class XSSVulnerableWebAppV2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = emf.createEntityManager();

        // Parâmetros obtidos diretamente do usuário (suposto valor inserido pelo usuário)
        String username = args[0];
        String password = args[1];

        // Inserção com vulnerabilidade de segurança (vulnerável a injeção de SQL)
        em.getTransaction().begin();
        em.createNativeQuery("INSERT INTO users (username, password) VALUES ('" + username + "', '" + password + "')").executeUpdate();
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}

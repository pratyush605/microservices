package com.microservice.UserService.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class NativeQueries {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Object exeQuery(String sql) {
        Query query = entityManager.createNativeQuery(sql);
        if (sql.trim().toLowerCase().startsWith("select")) {
            return query.getResultList(); // For SELECT queries
        }
        return query.executeUpdate();
    }
    @Transactional
    public int deleteUsersByIds(List<Integer> ids) {
        String idList = ids.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        String sql = "DELETE FROM users WHERE id IN (" + idList + ")";
        return entityManager.createNativeQuery(sql).executeUpdate();
    }
}

package com.microservice.UserService.service;

import com.microservice.UserService.repository.NativeQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NativeQueriesService {
    @Autowired
    private NativeQueries nativeQueriesRepo;

    public Object executeNativeQuery(String query) {
        return nativeQueriesRepo.exeQuery(query);
    }

    public int deleteNativeQuery(List<Integer> ids){
        return nativeQueriesRepo.deleteUsersByIds(ids);
    }
}
package com.cbfacademy.restapiexercise.ious;

import java.util.List;
// import java.util.NoSuchElementException;
// import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class IOUService {

    private final IOURepository iouRepository;

    public IOUService(IOURepository iouRepository){
        this.iouRepository = iouRepository;
    }
    public List<IOU> getAllIOUs(){
       return this.iouRepository.findAll();
    }

    // public IOU getIOU(UUID id) throws NoSuchElementException{
    //     if (iouOptional.isPresent()) {
    //         return iouOptional.get();
    //     } else {
    //         // Throw an exception if IOU is not found
    //         throw new NoSuchElementException("IOU with ID " + id + " not found.");
    //     }
    // } 
}

package com.example.demo.controllers;

import com.example.demo.DTO.PhotoDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class PhotoController {

    @RequestMapping("/api/photo")
    public Iterable<PhotoDTO> getAll(){
        List<PhotoDTO> photoDTO = new ArrayList<PhotoDTO>();
        PhotoDTO photoDTO1 = new PhotoDTO(1,"3","3");
        photoDTO.add(photoDTO1);
        return photoDTO;
    }

    @RequestMapping("/api/photo/{id}")
    public PhotoDTO getId(@PathVariable int id){
        List<PhotoDTO> photoDTOS = new ArrayList<>();
        photoDTOS.add(new PhotoDTO(1,"2","3"));
        photoDTOS.add(new PhotoDTO(3,"2","3"));
        photoDTOS.add(new PhotoDTO(2,"2","3"));
        Optional<PhotoDTO> photoDTO = photoDTOS.stream().filter(item -> item.getIntero() == id).findFirst();
        if (!photoDTO.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"item not fond");
        }
        return photoDTO.get();
    }
}
